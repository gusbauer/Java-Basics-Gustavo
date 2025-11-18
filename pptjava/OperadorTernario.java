/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class OperadorTernario {
// 👉 Nombre de la clase

    public static void main(String[] args) {  
        // 👉 Método principal donde empieza el programa

        int a = 10, b = 20;  
        // 👉 Se declaran dos variables enteras: a = 10 y b = 20

        // 👉 Uso del operador ternario:
        // (condición) ? valor_si_verdadero : valor_si_falso
        // Si la condición se cumple, devuelve el primer valor; si no, el segundo.

        String resultado = (a > b) ? "a es mayor" : "b es mayor";
        // 👉 Se evalúa si a > b
        // Como 10 no es mayor que 20, la condición es falsa.
        // Entonces se elige la parte después de los dos puntos → "b es mayor".
        // El valor "b es mayor" se guarda en la variable resultado.

        System.out.println(resultado);  
        // 👉 Muestra el contenido de la variable resultado → imprime: b es mayor
    }
}

