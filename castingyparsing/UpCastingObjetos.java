/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.castingyparsing;

/**
 *
 * @author gusta
 */
/*
3.1 Upcasting (Casting de Objetos)
----------------------------------

El UPCASTING ocurre cuando asignamos un objeto de una SUBCLASE
a una variable de su SUPERCLASE.

✔ Es automático (implícito)
✔ No requiere escribir ningún casting
✔ Se pueden usar los métodos definidos en la superclase
✘ No podemos acceder a métodos propios de la subclase (sin downcasting)

Ejemplo: Perro → Animal
*/

/*
3.1 Upcasting
*/

public class UpCastingObjetos {

    public static void main(String[] args) {

        Animal animal = new Perro(); // Upcasting implícito
        animal.sonido();             // Método de la superclase
    }
}
