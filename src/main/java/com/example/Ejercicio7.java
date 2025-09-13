package com.example;

public class Ejercicio7 {

    public static void ejercicio7() {

        // Declaración de variables
        int numero = 10;
        double temperatura = 25.5;
        int puntuacion = 85;
        boolean esEstudiante = true;

        // Verificación número par o impar
        if (numero % 2 == 0) {
            System.out.println("Número es par");
        } else
            System.out.println("Número es impar");

        // Verificación de temperatura
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else
            System.out.println("Temperatura agradable");

        // Verificación puntuación
        if (puntuacion >= 70) {
            System.out.println("Aprobado");
        } else
            System.out.println("Reprobado");

        // ¿Es estudiante?
        if (esEstudiante) {
            System.out.println("Es estudiante");
        }else
        System.out.println("No es estudiante");
      
    }
}
