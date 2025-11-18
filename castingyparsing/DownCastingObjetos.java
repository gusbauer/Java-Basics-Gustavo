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
3.2 Downcasting
---------------

El downcasting es convertir una referencia de la superclase
a una referencia de la SUBCLASE.

✔ Es explícito → debes escribir (Perro)
✔ Puede lanzar ClassCastException si el objeto NO es realmente de esa subclase
✔ Para evitar errores se usa:  obj instanceof Tipo

Este ejemplo muestra cómo hacerlo de forma segura.
*/

public class DownCastingObjetos {

    public static void main(String[] args) {

        // UPCASTING implícito → un Perro guardado en una referencia Animal
        Animal animal = new Perro();

        // Antes de hacer downcasting, verificamos el tipo real
        if (animal instanceof Perro) {

            // DOWNCASTING explícito: ahora la referencia ES de tipo Perro
            Perro perro = (Perro) animal;

            // Ahora sí podemos acceder a métodos propios de Perro
            perro.ladrar();  
            // Salida: "El perro ladra"
        } else {
            System.out.println("El objeto no es un Perro. No se puede hacer downcasting.");
        }
    }
}
