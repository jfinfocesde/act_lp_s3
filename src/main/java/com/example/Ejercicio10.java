package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        
        int edad = 25;
        double salario = 30000;
        boolean tieneExperiencia = true;

        System.out.println("--- Uso de operador AND (&&) ---");
        if (edad >= 18 && salario > 25000) {
            System.out.println("Califica para préstamo");
        } else {
            System.out.println("No califica para préstamo");
        }

        System.out.println(); 

        System.out.println("--- Uso de operador OR (||) ---");
        if (edad < 18 || edad > 65) {
            System.out.println("Descuento especial");
        } else {
            System.out.println("No aplica descuento especial");
        }

        System.out.println(); 

        System.out.println("--- Uso de operador NOT (!) ---");
        if (!tieneExperiencia) {
            System.out.println("Necesita capacitación");
        } else {
            System.out.println("Tiene experiencia, no necesita capacitación");
        }

        System.out.println();

        System.out.println("--- Combinación de operadores ---");
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) {
            System.out.println("Candidato ideal");
        } else {
            System.out.println("No es un candidato ideal");
        }

        System.out.println();

        boolean esFinDeSemana = false;
        boolean esFeriado = true;

        System.out.println("--- Escenario de clases ---");
        if (esFinDeSemana || esFeriado) {
            System.out.println("No hay clases");
        }

        if (!esFinDeSemana && !esFeriado) {
            System.out.println("Día de clases normal");
        }
    }
}

