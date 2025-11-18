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
Genera la secuencia de Collatz para un número.
La regla es:
- Si el número es par → dividir entre 2
- Si el número es impar → 3 * número + 1
Se repite hasta llegar a 1.
*/

public class SecuenciaDeCollatz {

    public static void secuenciaCollatz(int numero) {

        int pasos = 0; // Contador de pasos realizados

        // Mostrar el número inicial
        System.out.print(numero + " ");

        // Mientras no llegue a 1...
        while (numero != 1) {

            // Si es par → numero = numero / 2
            // Si es impar → numero = 3 * numero + 1
            numero = (numero % 2 == 0) ? numero / 2 : 3 * numero + 1;

            // Imprimimos el nuevo valor
            System.out.print(numero + " ");

            pasos++; // Sumamos un paso
        }

        // Al final imprimimos cuántos pasos tomó
        System.out.println("\nPasos totales: " + pasos);
    }

    // Método main para probarlo
    public static void main(String[] args) {
        secuenciaCollatz(12); // Ejemplo
    }
}

