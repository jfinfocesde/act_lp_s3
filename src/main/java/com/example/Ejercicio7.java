package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        // tu código aquí
        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else if (numero % 2 != 0){
            System.out.println("El número es impar");
            
        }
        double temperatura = 25.5;
            if (temperatura > 30) {
                System.out.println("El clima es caliente");

            }
        int puntuacion = 85;
        if (puntuacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        boolean esEstudiante = true;
        if (esEstudiante == true) {
            System.out.println("Es estudiante");
        } else if (esEstudiante == false) {
            System.out.println("No es estudiante");
        }
    }
}
