package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {

        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");

            double temperatura = 25.5;
            if (temperatura > 30) {
                System.out.println("Hace calor");
            } else {
                System.out.println("El clima es agradable");

            }

            int puntuacion = 85;
            if (puntuacion >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }

            boolean estudiante = true;
            if (estudiante) {
                System.out.println("Es estudiante");
            } else {
                System.out.println("No es estudiante");
            }
        }
    }
}
