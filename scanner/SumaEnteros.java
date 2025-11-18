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
3. Cálculo de la suma de enteros
Escribe un programa que lea tres números enteros ingresados por el usuario
y calcule su suma.
*/

import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int suma = num1 + num2 + num3;

        System.out.println("\nLa suma de los tres números es: " + suma);

        scanner.close();
    }
}
