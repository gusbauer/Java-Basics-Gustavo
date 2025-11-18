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
Método que resuelve una ecuación cuadrática del tipo:
ax^2 + bx + c = 0
Utiliza Math.pow() y Math.sqrt() para calcular las raíces.
*/

public class EcuacionCuadrática {

    // Método que resuelve la ecuación
    public static void resolverCuadratica(double a, double b, double c) {

        // Fórmula del discriminante: b² - 4ac
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Caso 1: discriminante > 0 → dos raíces reales distintas
        if (discriminante > 0) {

            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Raíces reales: " + raiz1 + " y " + raiz2);

        // Caso 2: discriminante == 0 → una única raíz real
        } else if (discriminante == 0) {

            double raiz = -b / (2 * a);
            System.out.println("Raíz única: " + raiz);

        // Caso 3: discriminante < 0 → raíces complejas
        } else {
            System.out.println("Raíces complejas (no reales).");
        }
    }

    // Método main opcional para probar el método
    public static void main(String[] args) {
        resolverCuadratica(1, -3, 2); // Ejemplo: x^2 - 3x + 2 = 0
    }
}
