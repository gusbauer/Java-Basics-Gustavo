/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosscanner;

/**
 *
 * @author gusta
 */
/* 
Escribe un programa que solicite al usuario su nombre, edad y altura,
y luego imprima esta información en un formato legible.
*/

import java.util.Scanner;

public class LeerDatosBasicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");

        scanner.close();
    }
}
