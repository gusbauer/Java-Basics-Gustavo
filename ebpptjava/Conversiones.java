/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Ejercicio 1: Conversion de Temperaturas Objetivo: Crear un programa que permita convertir temperaturas entre grados Celsius y Fahrenheit.
//Descripción:
//· El usuario debe ingresar una temperatura en grados Celsius.
//· El programa convertirá esa temperatura a Fahrenheit usando la formula:
//Fahrenheit = (Celsius × 9/5) +32
//· Luego, el programa deberá convertir una temperatura en Fahrenheit (ingresada por el usuario) a
//grados Celsius usando la fórmula:
//Celsius = (Fahrenheit - 32) × 5/9
//Instrucciones:
//1. Pedir al usuario que ingrese la temperatura en grados Celsius.
//2. Convertir esa temperatura a Fahrenheit y mostrar el resultado.
//3. Luego, pedir al usuario que ingrese la temperatura en Fahrenheit.
//4. Convertir esa temperatura a grados Celsius y mostrar el resultado.


/**
 * @author gusta
 * Programa que convierte temperaturas entre Celsius y Fahrenheit
 */
package mavenproject1; 
// 👉 Indica el "paquete" donde está el archivo dentro del proyecto

import java.util.Scanner; 
// 👉 Importa la clase Scanner para poder leer datos del teclado

public class Conversiones { 
// 👉 Nombre de la clase principal del programa

    public static void main(String[] args) { 
        // 👉 Método principal: donde empieza a ejecutarse el programa

        Scanner sc = new Scanner(System.in); 
        // 👉 Creamos un objeto Scanner llamado "sc" para leer datos del teclado

        // 👉 Pedimos al usuario una temperatura en grados Celsius
        System.out.print("Introduce la temperatura en grados Celsius: "); 
        // 👉 Muestra el texto sin salto de línea
        double celsius = sc.nextDouble(); 
        // 👉 Lee el número que el usuario introduce y lo guarda en la variable "celsius"

        double fahrenheit = (celsius * 9 / 5) + 32; 
        // 👉 Fórmula para convertir Celsius a Fahrenheit

        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F"); 
        // 👉 Muestra el resultado de la conversión

        // 👉 Pedimos ahora temperatura en grados Fahrenheit
        System.out.print("\nIntroduce la temperatura en grados Fahrenheit: "); 
        // 👉 El "\n" añade una línea en blanco antes del mensaje
        double fahrenheit2 = sc.nextDouble(); 
        // 👉 Lee el número que el usuario introduce y lo guarda en "fahrenheit2"

        double celsius2 = (fahrenheit2 - 32) * 5 / 9; 
        // 👉 Fórmula para convertir Fahrenheit a Celsius

        System.out.println(fahrenheit2 + " °F equivalen a " + celsius2 + " °C"); 
        // 👉 Muestra el resultado de la conversión

        sc.close(); 
        // 👉 Cierra el Scanner para liberar recursos (buena práctica)
    }
}
