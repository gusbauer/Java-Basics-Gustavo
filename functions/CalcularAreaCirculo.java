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
public class CalcularAreaCirculo 

{

    // Función devuelve el área de un círculo dado su radio
    public static double areaCirculo(double radio) {
        final double PI = 3.14159;
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el radio al usuario
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área usando la función
        double area = areaCirculo(radio);

        // Mostrar resultado
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
    
}
