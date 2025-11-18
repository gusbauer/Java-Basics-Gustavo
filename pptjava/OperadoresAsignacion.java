/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class OperadoresAsignacion {
    public static void main(String[] args) {
        int x = 10;

        x += 5; // x = x + 5 → x = 15
        System.out.println("Suma y asigna: " + x);

        x -= 3; // x = x - 3 → x = 12
        System.out.println("Resta y asigna: " + x);

        x *= 2; // x = x * 2 → x = 24
        System.out.println("Multiplica y asigna: " + x);

        x /= 4; // x = x / 4 → x = 6
        System.out.println("Divide y asigna: " + x);

        x %= 5; // x = x % 5 → x = 1
        System.out.println("Módulo y asigna: " + x);
    }
}