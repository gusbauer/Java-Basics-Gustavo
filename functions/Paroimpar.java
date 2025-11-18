/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavaprogramacionfunciones;

/**
 *
 * @author gusta
 */

import java.util.Scanner;

public class Paroimpar {

    // 🔹 Método que verifica si un número es par
    public static boolean esPar(int numero) {
        // Devuelve true si el número es divisible entre 2, false si no lo es
        return numero % 2 == 0;
    }

    // 🔹 Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        // Llamamos a la función esPar() y guardamos el resultado
        boolean resultado = esPar(num);

        // Mostramos el resultado
        if (resultado) {
            System.out.println(num + " es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }

        sc.close();
    }
}