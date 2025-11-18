 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsinConLocalizacion {
    public static void main(String[] args) {
        String numeroTexto = "1.000,50";

        Locale espanol = new Locale("es", "ES");
        NumberFormat formato = NumberFormat.getInstance(espanol);

        try {
            Number numero = formato.parse(numeroTexto);
            System.out.println("Número: " + numero); // 1000.5
        } catch (ParseException e) {
            System.out.println("Error: Formato de número no válido.");
        }
    }
}
