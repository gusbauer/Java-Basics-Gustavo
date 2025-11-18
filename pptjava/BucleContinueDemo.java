/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */

public class BucleContinueDemo {

    public static void main(String[] args) {

        // 👉 Bucle que cuenta del 0 al 4
        for (int i = 0; i < 5; i++) {

            // 👉 Cuando i vale 3, se salta el resto del código de esta vuelta
            if (i == 3) {
                continue; // Salta directamente a la siguiente iteración
            }

            // 👉 Solo se ejecuta si i NO es 3
            System.out.println("i es: " + i);
        }

        System.out.println("El bucle ha terminado.");
    }
}
