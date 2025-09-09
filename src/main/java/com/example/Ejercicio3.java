package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
    int contador = 5;
        System.out.println("Valor inicial: " + contador);
        System.out.println("Pre-incremento: " + (++contador));
        System.out.println("Post-incremento: " + (contador++));
        System.out.println("Pre-decremento: " + (--contador));
        System.out.println("Post-decremento: " + (contador--));
        // El pre operador cambia el valor antes de usarlo, el post operador usa el valor antes de cambiarlo.
        
    }
}
