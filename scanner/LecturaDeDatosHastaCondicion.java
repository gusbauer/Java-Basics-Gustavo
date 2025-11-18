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
6. Lectura de datos hasta una condición
Solicita al usuario que introduzca números enteros hasta que ingrese el número 0.
Imprime la suma total de los números ingresados.
*/

import java.util.Scanner;

public class LecturaDeDatosHastaCondicion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("\nLa suma total de los números es: " + suma);

        scanner.close();
    }
}
