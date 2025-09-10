package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {

        // Declaración de variables
        int contador = 5; 

        // Valor inicial de contador
        System.out.println("El valor inicial de contador es: " + contador);

        // Pre-incremento
        ++contador; 
        System.out.println("Pre-incremento es: " + ++contador);

        // Post-incremento
        contador++;
        System.out.println("Post-incremento es: " + contador++);

        // Pre-decremento
        --contador;
        System.out.println("Pre-decremento es: " + --contador);

        // Post-decremento
        contador--;
        System.out.println("Post-decremento es: " + contador--);

        // Diferencia entre pre y post operadores: 
        // Pre operadores: El operador se aplica antes de usar la variable.
        // Post operadores:El operador se aplica después de usar la variable.

    }
}
