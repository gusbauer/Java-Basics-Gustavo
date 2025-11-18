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

public class Promediocalificaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0; // acumulador de calificaciones

        // Pedimos 5 calificaciones
        System.out.println("Introduce 5 calificaciones (del 0 al 10):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = sc.nextDouble();
            suma += calificacion; // sumamos cada calificación
        }

        // Calculamos el promedio
        double promedio = suma / 5;

        System.out.println("\nEl promedio es: " + promedio);

        // Estructura condicional para saber si aprueba o no
        if (promedio >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        sc.close();
    }
}
