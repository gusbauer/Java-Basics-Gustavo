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
Solicita al usuario una frase completa y luego imprímela en mayúsculas.
*/

import java.util.Scanner;

public class LeerLineaCompleta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.println("\nFrase en mayúsculas: " + frase.toUpperCase());

        scanner.close();
    }
}
