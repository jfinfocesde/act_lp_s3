package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        // tu código aquí

        int x = 10;
        int y = 5;

        int resultadoSuma = sumar(x + y);
        System.out.println("La Suma de x + y : " + resultadoSuma);
        int resultadoResta = restar(x - y);
        System.out.println("La Resta de x - y : " + resultadoResta);
        int resultadoMultiplicacion = multiplicar(x * y);
        System.out.println("La Multiplicación de x * y: " + resultadoMultiplicacion);
        int resultadoDivision = dividir(x / y);
        System.out.println("La División de x / y: " + resultadoDivision);       
        int resultadoModulo = modulo(x % y);
        System.out.println("El Módulo de x % y: " + resultadoModulo);   



    }
}
