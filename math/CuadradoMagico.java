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
Método que comprueba si una matriz cuadrada es un CUADRADO MÁGICO.
Un cuadrado mágico cumple:
- Todas las filas suman lo mismo
- Todas las columnas suman lo mismo
- Las diagonales también (opcional en esta versión)
*/

import java.util.Arrays;

public class CuadradoMagico {

    public static boolean esCuadradoMagico(int[][] matriz) {

        // Suma de referencia: la suma de la PRIMERA FILA
        int sumaReferencia = Arrays.stream(matriz[0]).sum();

        // ------------------------------
        // 1. Comprobar suma de FILAS
        // ------------------------------
        for (int[] fila : matriz) {
            // Si alguna fila NO tiene la misma suma → no es cuadrado mágico
            if (Arrays.stream(fila).sum() != sumaReferencia) {
                return false;
            }
        }

        // ------------------------------
        // 2. Comprobar suma de COLUMNAS
        // ------------------------------
        for (int col = 0; col < matriz.length; col++) {

            int sumaColumna = 0;

            // Recorremos cada fila y sumamos el elemento [fila][col]
            for (int fila = 0; fila < matriz.length; fila++) {
                sumaColumna += matriz[fila][col];
            }

            // Si la columna no suma lo mismo → no es cuadrado mágico
            if (sumaColumna != sumaReferencia) {
                return false;
            }
        }

        // Si pasa todas las comprobaciones → ES cuadrado mágico
        return true;
    }

    // Método main para probarlo
    public static void main(String[] args) {

        int[][] cuadrado = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };

        if (esCuadradoMagico(cuadrado)) {
            System.out.println("Es un cuadrado mágico.");
        } else {
            System.out.println("NO es un cuadrado mágico.");
        }
    }
}

