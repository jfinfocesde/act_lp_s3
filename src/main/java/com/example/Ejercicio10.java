package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        // tu código aquí
        int edad = 25;
        double salario = 30000;
        boolean tieneExperiencia = true;
        if (edad >= 18 && salario > 25000) {
            System.out.println("califica para prestamo");
        }
        if (edad < 18 || edad > 65) {
            System.out.println("descuento especial");
        }
        if (!tieneExperiencia) {
            System.out.println("necesita capacitación");
        }
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) {
            System.out.println("candidato ideal");
        }
        boolean esFinDeSemana = false;
        boolean esFeriado = true;
        if (esFinDeSemana || esFeriado) {
            System.out.println("no hay clases");
        }
        if (!esFinDeSemana || !esFeriado) {
            System.out.println("dia de clases normal");
        }
    }
}
