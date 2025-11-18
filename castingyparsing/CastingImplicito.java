/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.castingyparsing;

/**
 *
 * @author gusta
 */
/*
Ejemplo de Casting Implícito en Java.
-------------------------------------

El casting implícito ocurre cuando Java convierte un tipo de dato
a otro tipo de MAYOR capacidad automáticamente.

En este ejemplo:
- un int (entero) se convierte a double (decimal)
- NO hay pérdida de información, porque un double puede almacenar un int sin problema
*/

public class CastingImplicito {
    public static void main(String[] args) {
        
        // Declaramos un entero
        int entero = 42;

        // Casting implícito: el int se convierte automáticamente en double
        // No usamos nada especial, Java lo hace solo.
        double decimal = entero;

        // Imprimimos ambos valores
        System.out.println("Valor entero: " + entero);   // Muestra: 42
        System.out.println("Valor double: " + decimal);  // Muestra: 42.0
    }
}
