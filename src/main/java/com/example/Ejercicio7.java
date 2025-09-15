package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
       
        // Verificar número par o impar
        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // Verificar temperatura
        double temperatura = 25.5;
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Temperatura agradable");
        }

        // Verificar puntuación
        int puntuacion = 85;
        if (puntuacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Verificar si es estudiante
        boolean esEstudiante = true;
        if (esEstudiante) {
            System.out.println("Es estudiante");
        } else {
            System.out.println("No es estudiante");
        }

        // Explicación:
        // - En if-else siempre se ejecuta uno de los dos bloques.
        // - Esto es diferente a usar solo "if", donde puede no ejecutarse ninguno.

    }
}
