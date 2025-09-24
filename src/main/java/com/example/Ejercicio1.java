package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        
         
        int x = 10;
        int y = 5;

       
        int resultadoSuma = x + y;
        int resultadoResta = x - y;
        int resultadoMultiplicacion = x * y;
        int resultadoDivision = x / y;
        int resultadoModulo = x % y;

        // Impresión de resultados
        System.out.println("La suma de " + x + " + " + y + " es: " + resultadoSuma);
        System.out.println("La resta de " + x + " - " + y + " es: " + resultadoResta);
        System.out.println("La multiplicación de " + x + " * " + y + " es: " + resultadoMultiplicacion);
        System.out.println("La división de " + x + " / " + y + " es: " + resultadoDivision);
        System.out.println("El módulo de " + x + " % " + y + " es: " + resultadoModulo);
    }
}
