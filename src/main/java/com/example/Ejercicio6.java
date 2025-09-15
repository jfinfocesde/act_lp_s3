package com.example;

public class Ejercicio6 {
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");

        // Verificar mayoría de edad
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

        // Verificar nota aprobatoria
        double nota = 7.5;
        if (nota >= 6.0) {
            System.out.println("Aprobado");
        }

        // Verificar si número es positivo, negativo o cero
        int numero = -5;
        if (numero > 0) {
            System.out.println("Número positivo");
        }
        if (numero < 0) {
            System.out.println("Número negativo");
        }
        if (numero == 0) {
            System.out.println("Número es cero");
        }

        // Explicación:
        // Cada "if" evalúa una condición booleana (true/false).
        // Si la condición es true, ejecuta el bloque dentro de {}.
        // En este ejercicio se usan if separados, no if-else,
        // porque se quiere mostrar cada condición de forma independiente.
    }
}
