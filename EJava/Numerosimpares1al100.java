/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavaprogramacion;

/**
 *
 * @author gusta
 */
public class Numerosimpares1al100 {
    public static void main(String[] args) {

        System.out.println("Números pares del 1 al 100:");

        // Recorremos los números del 1 al 100
        for (int i = 1; i <= 100; i++) {

            // Si el número es divisible entre 2, es par
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
