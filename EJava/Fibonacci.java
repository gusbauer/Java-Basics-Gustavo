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

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números de la serie Fibonacci quieres mostrar?: ");
        int n = sc.nextInt(); // cantidad de términos que el usuario desea ver

        int a = 0; // primer número de la serie
        int b = 1; // segundo número
        int siguiente;

        System.out.println("\nLos primeros " + n + " números de la serie Fibonacci son:");

        // mostramos los primeros dos manualmente (si el usuario pide al menos 1 o 2)
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // calculamos los siguientes valores desde el 3º hasta el n-ésimo
        int contador = 3;
        while (contador <= n) {
            siguiente = a + b;   // el siguiente número es la suma de los dos anteriores
            System.out.print(siguiente + " ");
            a = b;               // movemos los valores hacia adelante
            b = siguiente;
            contador++;
        }

        System.out.println(); // salto de línea final
        sc.close();
    }
}
