package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        int edad = 25;
        double salario = 30000;
        boolean tieneExperiencia = true;

        // AND (&&)
        if (edad >= 18 && salario > 25000) {
            System.out.println("Califica para préstamo");
        }

        // OR (||)
        if (edad < 18 || edad > 65) {
            System.out.println("Descuento especial");
        }

        // NOT (!)
        if (!tieneExperiencia) {
            System.out.println("Necesita capacitación");
        }

        // Combinación de operadores
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) {
            System.out.println("Candidato ideal");
        }

        // Ejemplo con días de semana
        boolean esFinDeSemana = false;
        boolean esFeriado = true;

        if (esFinDeSemana || esFeriado) {
            System.out.println("No hay clases");
        }

        if (!esFinDeSemana && !esFeriado) {
            System.out.println("Día de clases normal");
        }

        // Explicación:
        // - && → ambas condiciones deben ser verdaderas.
        // - || → al menos una condición debe ser verdadera.
        // - ! → invierte el valor booleano.
    }
}
