package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
      int edad = 25; double salario = 30000; boolean tieneExperiencia = true;
        if (edad >= 18 && salario > 25000) System.out.println("Califica para préstamo");
        if (edad < 18 || edad > 65) System.out.println("Descuento especial");
        if (!tieneExperiencia) System.out.println("Necesita capacitación");
        if (edad >= 25 && (salario > 20000 || tieneExperiencia)) System.out.println("Candidato ideal");
        boolean esFinDeSemana = false, esFeriado = true;
        if (esFinDeSemana || esFeriado) System.out.println("No hay clases");
        if (!esFinDeSemana && !esFeriado) System.out.println("Día de clases normal");
    }
}
