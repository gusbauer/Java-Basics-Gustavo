/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class BucleBreak {

    public static void main(String[] args) {
        // 👉 Bucle for que empieza en i = 0 y termina cuando i < 10
        for (int i = 0; i < 10; i++) {

            // 👉 Cuando i llega a 5, se cumple la condición
            if (i == 5) {
                // 👉 'break' detiene el bucle completamente
                break;
            }

            // 👉 Esta línea se ejecuta solo mientras i no sea 5
            System.out.println("i es: " + i);
        }

        System.out.println("El bucle ha terminado.");
        // 👉 Este mensaje se muestra después de salir del bucle
    }
}