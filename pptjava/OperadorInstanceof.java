/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacionjava;

/**
 *
 * @author gusta
 */
    // 👉 Clase base (superclase)
class Animal { }

// 👉 Clase hija (subclase) que hereda de Animal
class Perro extends Animal { }

public class OperadorInstanceof {

    public static void main(String[] args) {
        // 👉 Creamos un objeto de tipo Animal
        Animal a = new Animal();

        // 👉 Creamos un objeto de tipo Perro
        Perro p = new Perro();

        // 👉 Comprobamos si 'p' es una instancia (objeto) de la clase Perro
        System.out.println("p instanceof Perro: " + (p instanceof Perro));
        // true → porque 'p' fue creado como un Perro

        // 👉 Comprobamos si 'p' también es una instancia de Animal
        System.out.println("p instanceof Animal: " + (p instanceof Animal));
        // true → porque Perro hereda de Animal

        // 👉 Comprobamos si 'a' (que es un Animal) es también un Perro
        System.out.println("a instanceof Perro: " + (a instanceof Perro));
        // false → porque 'a' fue creado como un Animal, no como un Perro
    }
}