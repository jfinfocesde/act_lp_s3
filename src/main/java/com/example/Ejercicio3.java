package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        
        int contador = 5;
        System.out.println("Valor inicial del contador: " + contador);

        ++contador; // pre-incremento
        System.out.println("pre-incremento: " + contador);

        contador++; // post-incremento
        System.out.println("post-incremento: " + contador);

        --contador; // pre-decremento
        System.out.println("pre-decremento: " + contador);

        contador--; // post-decremento
        System.out.println("post-decremento: " + contador);

        // pre incremento y pre decremento modifican el valor antes de usarlo en una expresión
        // post incremento y post decremento modifican el valor después de usarlo en una expresión

    }
}
