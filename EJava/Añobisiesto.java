/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavaprogramacion;

/**
 *
 * @author gusta
 */    

import java.util.Scanner;

public class Añobisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        // Un año es bisiesto si cumple:
        // - Es divisible entre 4
        // - Pero NO es divisible entre 100, excepto si también es divisible entre 400
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto ");
        } else {
            System.out.println(año + " no es un año bisiesto ");
        }

        sc.close();
    }
}
