/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class parsingEjemplo {
    public static void main(String[] args) {
        String fechaTexto = "2024-11-07";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate fecha = LocalDate.parse(fechaTexto, formato);
            System.out.println("Fecha OK: " + fecha);               // 2024-11-07
            System.out.println("Formateada: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // 07/11/2024
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha no válido: " + e.getParsedString());
        }
    }
}
