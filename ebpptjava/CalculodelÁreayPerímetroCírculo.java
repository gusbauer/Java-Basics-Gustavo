/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *package com.mycompany.ejericiosbuenospresentacion;
 * @author gusta
 */
/*
 * Ejercicio 2: Cálculo del Área y Perímetro de un Círculo
 *
 * Objetivo:
 * Escribir un programa que calcule el área y el perímetro de un círculo dado su radio.
 *
 * Descripción:
 * · Pedir al usuario que ingrese el radio del círculo.
 * · Calcular el área usando la fórmula:
 *      Área = π × radio²
 * · Calcular el perímetro usando la fórmula:
 *      Perímetro = 2 × π × radio
 *
 * Instrucciones:
 * 1. Pedir al usuario que ingrese el radio.
 * 2. Calcular y mostrar el área del círculo.
 * 3. Calcular y mostrar el perímetro del círculo.
 */
    import java.util.Scanner;  
// 👉 Importamos la clase Scanner para poder leer datos desde el teclado

public class CalculodelÁreayPerímetroCírculo {  
// 👉 Nombre de la clase principal

    public static void main(String[] args) {  
        // 👉 Método principal donde comienza a ejecutarse el programa

        Scanner scanner = new Scanner(System.in);
        // 👉 Creamos el objeto "scanner" para leer datos introducidos por el usuario

        // 👉 Pedimos el radio al usuario
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        // 👉 Guardamos el valor que el usuario introduce en la variable "radio"

        // 👉 Constante para el valor de Pi (no cambia durante la ejecución)
        final double PI = 3.14159;

        // 👉 Calculamos el área del círculo con la fórmula: π * r²
        double area = PI * Math.pow(radio, 2);
        // 👉 Calculamos el perímetro (circunferencia) con la fórmula: 2 * π * r
        double perimetro = 2 * PI * radio;

        // 👉 Mostramos los resultados por pantalla
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        scanner.close(); 
        // 👉 Cerramos el Scanner (buena práctica para liberar recursos)
    }
}

