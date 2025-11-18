/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosscanner;

/**
 *
 * @author gusta
 */
/*
4. Validación de tipos
Crea un programa que lea un dato y valide si es un número entero,
un número decimal o una cadena de texto.
*/

import java.util.Scanner;

public class ValidacionTipos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("Es un número entero: " + num);

        } else if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            System.out.println("Es un número decimal: " + num);

        } else if (scanner.hasNext()) {
            String texto = scanner.next();
            System.out.println("Es un texto: " + texto);
        }

        scanner.close();
    }
}
