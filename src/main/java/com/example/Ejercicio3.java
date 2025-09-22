package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        // tu código aquí
        int contador = 5;
        System.out.println("Valor inicial: " + contador);

        // Pre-incremento: primero incrementa, luego usa el valor
        System.out.println("Pre-incremento (++contador): " + (++contador)); // Resultado= 6

        // Post-incremento: primero usa el valor, luego incrementa
        System.out.println("Post-incremento (contador++): " + (contador++)); // Resultado= 6
        System.out.println("Después del post-incremento: " + contador);      // Resultado= 7

        // Pre-decremento: primero decrementa, luego usa el valor
        System.out.println("Pre-decremento (--contador): " + (--contador)); // Resultado= 6

        // Post-decremento: primero usa el valor, luego decrementa
        System.out.println("Post-decremento (contador--): " + (contador--)); // Resultado= 6
        System.out.println("Después del post-decremento: " + contador);      // Resultado= 5
    }
}
