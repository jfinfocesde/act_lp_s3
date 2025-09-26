package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        
        int calificacion = 85; 
        String letraCalificacion;

        if (calificacion >= 90) {
            letraCalificacion = "A";
        } else if (calificacion >= 80) {
            letraCalificacion = "B";
        } else if (calificacion >= 70) {
            letraCalificacion = "C";
        } else if (calificacion >= 60) {
            letraCalificacion = "D";
        } else {
            letraCalificacion = "F";
        }

        System.out.println("La calificación es: " + letraCalificacion);

        System.out.println("--------------------");

        int hora = 14;
        String saludo;

        if (hora < 12) {
            saludo = "Buenos días";
        } else if (hora < 18) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo);
    }
}
