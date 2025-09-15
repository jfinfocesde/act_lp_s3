package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        int contador = 5;
        System.out.println("Valor inicial: " + contador);

        // Pre-incremento
        System.out.println("Pre-incremento (++contador): " + (++contador));

        // Post-incremento
        System.out.println("Post-incremento (contador++): " + (contador++));
        System.out.println("Después del post-incremento, contador = " + contador);

        // Pre-decremento
        System.out.println("Pre-decremento (--contador): " + (--contador));

        // Post-decremento
        System.out.println("Post-decremento (contador--): " + (contador--));
        System.out.println("Después del post-decremento, contador = " + contador);

        // Explicación con contador:
        // - Pre (++contador / --contador): primero cambia el valor y luego lo devuelve.
        // - Post (contador++ / contador--): primero devuelve el valor y después lo
        // cambia.

    }
}
