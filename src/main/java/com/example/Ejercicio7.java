package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

       
        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

       
        double temperatura = 25.5;
        if (temperatura > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Temperatura agradable");
        }

       
        int puntuacion = 85;
        if (puntuacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        
        boolean esEstudiante = true;
        if (esEstudiante) {
            System.out.println("Es estudiante");
        } else {
            System.out.println("No es estudiante");
        }
    }
}
