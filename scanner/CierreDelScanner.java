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
10. Cierre del Scanner
Escribe un programa que lea números enteros de entrada estándar hasta que el usuario escriba "STOP".
Suma todos los números y luego cierra el objeto Scanner al finalizar.
*/

import java.util.Scanner;

public class CierreDelScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String entrada;

        while (true) {

            System.out.print("Ingrese un número (o 'STOP' para terminar): ");
            entrada = scanner.nextLine();

            // Si el usuario escribe STOP, finalizamos el bucle
            if (entrada.equalsIgnoreCase("STOP")) {
                break;
            }

            // Intentamos convertir la entrada a número entero
            try {
                suma += Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        }

        System.out.println("\nLa suma total es: " + suma);

        scanner.close();
    }
}
