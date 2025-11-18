/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosscanner;

/**
 *
 * @author gusta
 */

/*
7. Localización y formato
Configura el Scanner para aceptar números en formato francés (donde la coma es el separador decimal).
Lee un número decimal y muéstralo con dos decimales.
*/

import java.util.Scanner;
import java.util.Locale;

public class LoaclizaciónYFormateo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.FRANCE);

        System.out.print("Ingrese un número decimal (en formato francés, por ejemplo 10,5): ");
        double numero = scanner.nextDouble();

        System.out.printf("Número ingresado: %.2f\n", numero);

        scanner.close();
    }
}
