package com.mycompany.castingyparsing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
/*
Casting entre Otros Tipos Primitivos
------------------------------------

También podemos realizar casting entre cualquier tipo primitivo,
pero debemos tener cuidado:

⚠ Puede haber pérdida de datos cuando convertimos un tipo con mayor rango
   → a un tipo con menor rango.

Ejemplos peligrosos:
- long  → short
- float → byte
- int   → byte
- double → float

En estos casos Java NO hace la conversión automáticamente.
Requiere casting explícito: (tipoDestino)
*/

public class CastingEntrePrimitivos {
    public static void main(String[] args) {

        // Valor de tipo long (muy grande)
        long largo = 100000;

        // Casting explícito de long a short
        // short solo puede almacenar valores entre -32768 y 32767
        // → 100000 está FUERA de ese rango
        // El resultado se "desborda" (overflow) y se pierde información
        short corto = (short) largo;

        // Mostramos los valores
        System.out.println("Valor long: " + largo);                      // 100000
        System.out.println("Valor short tras casting: " + corto);        // Valor truncado
    }
}

