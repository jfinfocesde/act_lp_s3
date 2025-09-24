package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");

        // Declarar la variable
        int contador = 5;

        // Mostrar valor inicial
        System.out.println("Valor inicial de contador: " + contador);

        // Pre-incremento (++contador): primero incrementa y luego usa el valor
        System.out.println("Pre-incremento (++contador): " + (++contador));

        // Post-incremento (contador++): primero usa el valor y luego incrementa
        System.out.println("Post-incremento (contador++): " + (contador++));

        // Mostrar valor de contador después del post-incremento
        System.out.println("Valor de contador tras post-incremento: " + contador);

        // Pre-decremento (--contador): primero decrementa y luego usa el valor
        System.out.println("Pre-decremento (--contador): " + (--contador));

        // Post-decremento (contador--): primero usa el valor y luego decrementa
        System.out.println("Post-decremento (contador--): " + (contador--));

        // Mostrar valor de contador después del post-decremento
        System.out.println("Valor de contador tras post-decremento: " + contador);

        /*
         * Explicación:
         * - Pre-incremento (++contador): suma la variable antes de devolver su valor.
         * - Post-incremento (contador++): devuelve el valor actual y después suma.
         * - Pre-decremento (--contador): resta primero y luego devuelve el nuevo valor.
         * - Post-decremento (contador--): devuelve el valor actual y después resta.
         */
    }
}


