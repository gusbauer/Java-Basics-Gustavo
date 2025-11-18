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
9. Operaciones con múltiples líneas
Solicita al usuario varias líneas de texto. Al final, imprime la cantidad de líneas ingresadas.
*/

import java.util.Scanner;

public class OperacionesConMultiplesLineas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese texto (escriba 'fin' para terminar):");

        while (scanner.hasNextLine()) {

            String linea = scanner.nextLine();

            // Si el usuario escribe "fin", terminamos
            if (linea.equalsIgnoreCase("fin")) {
                break;
            }

            contador++;
        }

        System.out.println("\nNúmero total de líneas ingresadas: " + contador);

        scanner.close();
    }
}
