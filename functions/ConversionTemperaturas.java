/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavaprogramacionfunciones;

/**
 *
 * @author gusta
 */
import java.util.Scanner;

public class ConversionTemperaturas {

    // 🔹 Función que convierte grados Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}
