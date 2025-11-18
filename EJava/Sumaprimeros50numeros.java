/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjavaprogramacion;

/**
 *
 * @author gusta
 */
public class Sumaprimeros50numeros {
    public static void main(String[] args) {
        
        int suma = 0; // variable acumuladora
        
        for (int i = 1; i <=50; i++) {
            suma = suma + i;
        }
        
        System.out.println("La sumatorio 50 priemros números naturales son: " + suma);
    }
}