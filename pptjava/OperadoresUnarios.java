/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class OperadoresUnarios { 
// 👉 Nombre de la clase

    public static void main(String[] args) {  
        // 👉 Método principal, donde empieza el programa

        int x = 10;  
        // 👉 Declaramos una variable entera llamada x y le damos el valor inicial 10

        System.out.println("Valor inicial: " + x);  
        // 👉 Muestra el valor actual de x → imprime: Valor inicial: 10

        x++;  
        // 👉 Operador de incremento postfijo: aumenta x en 1 (x pasa de 10 a 11)
        // 👉 Es igual que escribir: x = x + 1;

        System.out.println("Después de x++: " + x);  
        // 👉 Muestra el nuevo valor de x → imprime: Después de x++: 11

        ++x;  
        // 👉 Operador de incremento prefijo: también aumenta x en 1 (x pasa de 11 a 12)
        // 👉 La diferencia entre ++x y x++ solo se nota cuando se usan dentro de expresiones.

        System.out.println("Después de ++x: " + x);  
        // 👉 Muestra el nuevo valor de x → imprime: Después de ++x: 12

        x--;  
        // 👉 Operador de decremento postfijo: resta 1 al valor de x (x pasa de 12 a 11)
        // 👉 Es igual que escribir: x = x - 1;

        System.out.println("Después de x--: " + x);  
        // 👉 Muestra el nuevo valor de x → imprime: Después de x--: 11

        --x;  
        // 👉 Operador de decremento prefijo: también resta 1 (x pasa de 11 a 10)
        // 👉 Igual que x--, pero aplicado antes si se usa dentro de expresiones.

        System.out.println("Después de --x: " + x);  
        // 👉 Muestra el valor final → imprime: Después de --x: 10
    }
}
