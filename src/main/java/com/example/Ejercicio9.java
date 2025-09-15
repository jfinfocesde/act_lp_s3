package com.example;

public class Ejercicio9 {
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");

        int a = 10;
        int b = 20;

        // Comparaciones con enteros
        System.out.println("a == b: " + (a == b)); // igualdad
        System.out.println("a != b: " + (a != b)); // desigualdad
        System.out.println("a < b: " + (a < b)); // menor que
        System.out.println("a > b: " + (a > b)); // mayor que
        System.out.println("a <= b: " + (a <= b)); // menor o igual que
        System.out.println("a >= b: " + (a >= b)); // mayor o igual que

        // Comparaciones con Strings
        String texto1 = "Hola";
        String texto2 = "Hola";
        System.out.println("texto1.equals(texto2): " + texto1.equals(texto2));

        // Explicación:
        // - Los operadores ==, !=, <, >, <=, >= solo funcionan directamente con
        // números.
        // - Para comparar cadenas, se debe usar .equals().
    }
}
