package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

        int numero = 15;
        if (numero %2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        double temperatura = 22.5;
        if (temperatura > 30) {
            System.out.println("Hace calor.");
        } else if (temperatura < 15) {
            System.out.println("Hace frío.");
        } else {
            System.out.println("El clima es agradable.");
        }
        int puntuacion = 85;
        if ( puntuacion >= 75) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }
        boolean esEstudiante = true;
        if (esEstudiante) {
            System.out.println("Es estudiante");
        } else {
            System.out.println("No es estudiante");
        }
    }
}
