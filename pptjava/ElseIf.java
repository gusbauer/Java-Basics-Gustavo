/*
 * Ejercicio: Clasificación de notas con if-else
 */
package com.mycompany.presentacionjava;

public class ElseIf {
    public static void main(String[] args) {
        int nota = 85;  
        // 👉 Declaramos una variable entera llamada "nota" con valor 85

        if (nota >= 90) {
            System.out.println("Tienes una A.");
        } else if (nota >= 80) {
            System.out.println("Tienes una B.");
        } else if (nota >= 70) {
            System.out.println("Tienes una C.");
        } else {
            System.out.println("Necesitas mejorar.");
        }
    }
}
