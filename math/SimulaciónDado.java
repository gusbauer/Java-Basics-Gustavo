/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosmath;

/**
 *
 * @author gusta
 */
public class SimulaciónDado {

    // Método que simula lanzar un dado 100 veces
    public static void lanzarDado() {

        // Array para contar cuántas veces salió cada cara (1 a 6)
        int[] resultados = new int[6];

        // Lanzamos el dado 100 veces
        for (int i = 0; i < 100; i++) {

            // Genera un número del 1 al 6
            int cara = (int) (Math.random() * 6) + 1;

            // Suma 1 en la posición correspondiente
            resultados[cara - 1]++;
        }

        // Muestra los resultados
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + resultados[i] + " veces");

            if (resultados[i] > 25) {
                System.out.println("→ La cara " + (i + 1) + " salió más de 25 veces.");
            }
        }
    }

    // 💥 ESTE MÉTODO ES NECESARIO PARA EJECUTAR EL PROGRAMA
    public static void main(String[] args) {
        lanzarDado();  // Llamamos al método que hemos creado
    }
}
