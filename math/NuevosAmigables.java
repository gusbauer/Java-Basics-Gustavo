/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosmath;

/**
 *
 * @author gusta
 */
/*
 * Clase que busca parejas de números amigables dentro de un rango.
 * Dos números a y b son amigables si:
 *   - la suma de los divisores propios de a es b
 *   - y la suma de los divisores propios de b es a
 *   - y a ≠ b
 */
public class NuevosAmigables {

    // Método que calcula la suma de los divisores propios de un número.
    // Divisores propios = todos los divisores POSITIVOS menores que el número (sin incluirlo).
    public static int sumaDivisores(int num) {

        int suma = 0; // Acumulará la suma de los divisores

        // Recorremos todos los números desde 1 hasta num-1
        for (int i = 1; i < num; i++) {

            // Si i es divisor de num (es decir, el resto es 0)
            if (num % i == 0) {
                suma += i; // Sumamos i a la suma total
            }
        }

        return suma; // Devolvemos la suma de los divisores propios
    }

    // Método que busca y muestra todas las parejas de números amigables
    // desde 1 hasta "rango" (excluido).
    public static void numerosAmigables(int rango) {

        // Recorremos todos los posibles valores de a
        for (int a = 1; a < rango; a++) {

            // Calculamos la suma de divisores propios de a
            int b = sumaDivisores(a);

            // Comprobamos que:
            // 1) a < b para no repetir parejas al revés (evitamos (b, a))
            // 2) b está dentro del rango (opcional pero recomendable)
            // 3) la suma de divisores propios de b es a → condición de números amigables
            if (a < b && b < rango && sumaDivisores(b) == a) {
                System.out.println("Pareja amigable: (" + a + ", " + b + ")");
            }
        }
    }

    // Método main para probar la clase
    public static void main(String[] args) {

        // Llamamos al método con un rango, por ejemplo 10000
        // (es un rango típico para ver algunas parejas conocidas)
        numerosAmigables(10000);
    }       
}

