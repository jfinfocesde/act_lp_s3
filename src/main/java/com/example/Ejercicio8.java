package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {

        // Declaración de variables
        int calificacion = 85;
        int hora = 14;

        // Determinar la letra de calificación
        if (calificacion >= 90) {
            System.out.println("A");
        } else if (calificacion >= 80) {
            System.out.println("B");
        } else if (calificacion > 70) {
            System.out.println("C");
        }
        if (calificacion >= 60) {
            System.out.println("D");
        } else
            System.out.println("F");

           // Saludo según la hora
           if (hora < 12) {
            System.out.println("Buenos días");
           }else if (hora < 18) {
            System.out.println("Buenas tardes");
           }else
           System.out.println("Buenas noches");
    }

}
