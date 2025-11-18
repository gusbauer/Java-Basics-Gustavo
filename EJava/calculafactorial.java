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

public class calculafactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt(); // número ingresado por el usuario

        int factorial = 1; // acumulador del resultado
        int i = 1;         // contador para el bucle

        // Mientras i sea menor o igual al número
        while (i <= numero) {
            factorial = factorial * i; // multiplicamos el acumulador por i
            i++; // aumentamos i
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }
}