/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
    /*
 * Ejercicio 3: Operaciones con Números Enteros
 *
 * Objetivo:
 * Escribir un programa que pida al usuario dos números enteros y
 * realice las operaciones básicas: suma, resta, multiplicación, división y módulo.
 *
 * Instrucciones:
 * 1. Pedir al usuario dos números enteros.
 * 2. Calcular y mostrar la suma, resta, multiplicación, división entera y módulo.
 */

import java.util.Scanner;  
// 👉 Importamos la clase Scanner para leer datos desde el teclado

public class OperacionesEnteros {  
// 👉 Nombre de la clase principal

    public static void main(String[] args) {  
        // 👉 Método principal donde comienza el programa

        Scanner scanner = new Scanner(System.in);
        // 👉 Creamos un objeto Scanner llamado "scanner" para leer los números

        // 👉 Pedir al usuario dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();  
        // 👉 Guarda el primer número introducido

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();  
        // 👉 Guarda el segundo número introducido

        // 👉 Realizar las operaciones básicas
        int suma = num1 + num2;  
        int resta = num1 - num2;  
        int multiplicacion = num1 * num2;  
        int division = num1 / num2;  // 👉 División entera (solo parte entera del cociente)
        int modulo = num1 % num2;    // 👉 Resto de la división (módulo)

        // 👉 Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División (cociente entero): " + division);
        System.out.println("Módulo (resto): " + modulo);

        scanner.close();  
        // 👉 Cerramos el Scanner (buena práctica)
    }
}

