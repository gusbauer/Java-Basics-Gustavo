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

public class Mayor3numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos tres números
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        int mayor; // variable donde guardaremos el número mayor

        // Comprobamos con if-else cuál es el más grande
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostramos el resultado
        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}