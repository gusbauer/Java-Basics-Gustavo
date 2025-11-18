package com.mycompany.ejerciciosjavaprogramacion;

import java.util.Scanner;
public class NotaPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Captura por teclado y validación de notas
        System.out.println("Introduce la nota del examen práctico: ");
        int exPractico = sc.nextInt();
        System.out.println("Introduce la nota del examen teórico: ");
        int exTeorico = sc.nextInt();
        System.out.println("Introduce la nota de las actividades: ");
        int actividades = sc.nextInt();
        System.out.println("Introduce la nota de asistencia: ");
        int asistencia = sc.nextInt();
        sc.close();

        // Validación de rango
        if (exPractico < 0 || exPractico > 10 || exTeorico < 0 || exTeorico > 10 ||
            actividades < 0 || actividades > 10 || asistencia < 0 || asistencia > 10) {
            System.out.println("Error: Las notas deben estar entre 0 y 10.");
            return;
        }

        // Cálculo del promedio
        double promedio = (exPractico + exTeorico + actividades + asistencia) / 4.0;

        // Verificar si el alumno aprueba
        boolean esAprobado = promedio > 5;
        boolean notasSuficientes = (exPractico >= 4) && (exTeorico >= 4) &&
                                   (actividades >= 4) && (asistencia >= 4);

        // Mostrar resultados
        System.out.println("***** Resultados *****");
        System.out.println("Nota examen práctico: " + exPractico);
        System.out.println("Nota examen teórico: " + exTeorico);
        System.out.println("Nota actividades: " + actividades);
        System.out.println("Nota asistencia: " + asistencia);
        System.out.println("El promedio es: " + promedio);

        if (esAprobado && notasSuficientes) {
            System.out.println("El alumno ha aprobado");
        } else {
            System.out.println("El alumno ha suspendido");
        }

        System.out.println("***** Fin del programa *****");
    }
}