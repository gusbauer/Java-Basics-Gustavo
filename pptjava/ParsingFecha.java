/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
import java. text. ParseException;
import java. text.SimpleDateFormat;
import java.util.Date;
public class ParsingFecha {
public static void main(String[ ] args) {
String fechaTexto = "07-10-2024";
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
try {
Date fecha = formato.parse(fechaTexto);
System.out.println("Fecha: " + fecha);
} catch (ParseException e) {
System. out. println("Error: Formato de fecha no válido.");
}
}

}
