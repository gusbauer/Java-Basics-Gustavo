/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.castingyparsing;

/**
 *
 * @author gusta
 */
/*
2.2 Casting Explícito
---------------------

El casting explícito se usa cuando queremos convertir un tipo de dato
DE MAYOR PRECISIÓN → A MENOR PRECISIÓN.

Ejemplos típicos:
- double → int
- long → int
- float → int

⚠ IMPORTANTE:
Puede haber pérdida de información.
Java NO lo hace automáticamente, por eso hay que escribir el tipo entre paréntesis.
*/

public class CastingExplícito {
    public static void main(String[] args) {

        // Variable de tipo double (decimal con parte fraccionaria)
        double decimal = 42.89;

        // Casting explícito: convertimos el double a int
        // Para hacerlo, debemos poner (int) antes del valor
        // Esto elimina la parte decimal (pérdida de precisión)
        int entero = (int) decimal;

        // Mostrar valores antes y después del casting
        System.out.println("Valor double original: " + decimal);       // 42.89
        System.out.println("Valor entero tras casting: " + entero);   // 42
    }
}