/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
public class OperadoresComparacion {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a != b: " + (a != b));       // true
        System.out.println("a > b: " + (a > b));         // true
        System.out.println("a < b: " + (a < b));         // false
        System.out.println("a >= 10: " + (a >= 10));     // true
        System.out.println("b <= 5: " + (b <= 5));       // true
    }
}