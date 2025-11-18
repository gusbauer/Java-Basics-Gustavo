/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class ConvertirNumeroTextoEntero {
    public static void main(String[] args) {
            String numeroTexto = "2024";
            int anio = Integer.parseInt(numeroTexto); // Parsing de String @ int
        System.out.println("Valor original (String): " + numeroTexto);
        System.out.println("Valor convertido (int): " + anio);
        System.out.println("Valor incrementado: " + (anio +1));
}

}