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
public class posoneg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble(); // Se usa double por si el usuario pone decimales

        if (numero > 0) {
            System.out.println("El número es positivo ");
        } else if (numero < 0) {
            System.out.println("El número es negativo ");
        } else {
            System.out.println("El número es cero ⚪");
        }

        sc.close();
    }
}
