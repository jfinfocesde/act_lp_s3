package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        int edad =25;
        double salario = 30.000;
        boolean tieneExperiencia = true;

        if (edad >= 18 && salario > 25.000) {
            System.out.println("califica para prestamo");
            
        }

        if (edad < 18 || edad > 65){ 
            System.out.println("descuento especial");
        }

        if (!tieneExperiencia) {
            System.out.println("Necesita capacitación");
            
        }

        if (edad >= 25 && (salario > 20.000 || tieneExperiencia)) {
            System.out.println("Candidato ideal");   
            
        }

        boolean esFinDesemana = false;
        boolean esFeriado = true;

        if (esFinDesemana || esFeriado) {
            System.out.println("No hay clases");
        } 

        if (!esFinDesemana && !esFeriado) {
            System.out.println("Día de clases normal");
            
        }
        
        
    }
}
