package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {

        // Declaración de variables
        int edad = 25;
        double salario = 30000;
        boolean tieneExperiencia = true;
        boolean esFinDeSemana = false;
        boolean esFeriado = true;

        // Uso del operador AND (&&)
        if (edad >= 18 && salario > 25000) {
            System.out.println("Califica para préstamo");
        }
        // Uso del operador OR (||)
        if (edad < 18 || edad > 65) {
            System.out.println("Descuento especial");
        }
        // Uso del operador NOT (!)
        if (!tieneExperiencia) {
            System.out.println("Necesita capacitación");
        }
        // Combinación de operadores
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) {
            System.out.println("Candidato ideal");
        }
        // Uso de operadores con variables booleanas
        if (esFinDeSemana || esFeriado) {
            System.out.println("No hay clases");
        }
        if (!esFinDeSemana && !esFeriado) {
            System.out.println("Día de clases normal");
        }
    }
}
