package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");

        //  letra de calificación
        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Calificación: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificación: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificación: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }

        //  saludo según la hora
        int hora = 14;
        if (hora < 12) {
            System.out.println("Buenos días");
        } else if (hora < 18) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}

