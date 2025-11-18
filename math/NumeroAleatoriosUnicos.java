/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosmath;

/**
 *
 * @author gusta
 */
/*
Método que genera n números aleatorios ÚNICOS dentro del rango [min, max].
Utiliza Math.random() para generar los números y un HashSet para evitar repetidos.
*/

import java.util.Set;
import java.util.HashSet;

public class NumeroAleatoriosUnicos {

    public static void numerosAleatoriosUnicos(int n, int min, int max) {

        // HashSet almacena solo valores únicos (no permite duplicados)
        Set<Integer> numeros = new HashSet<>();

        // Mientras no hayamos generado n números únicos...
        while (numeros.size() < n) {

            // Math.random() genera un decimal entre 0.0 y 1.0
            // Multiplicamos por (max - min + 1) para ajustar el rango
            // Convertimos a int y sumamos min → número entre min y max
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;

            // Lo añadimos al Set (si ya existe, simplemente NO se añade)
            numeros.add(aleatorio);
        }

        // Mostramos el conjunto de números únicos generados
        System.out.println("Números únicos: " + numeros);
    }

    // Método main para probarlo
    public static void main(String[] args) {
        numerosAleatoriosUnicos(5, 1, 50);  // Por ejemplo, 5 números únicos entre 1 y 50
    }
}
