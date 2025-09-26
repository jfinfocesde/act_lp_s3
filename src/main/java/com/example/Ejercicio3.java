package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        
        int contador = 5;
        System.out.println("Valor inicial del contador: " + contador);
        System.out.println("Valor del pre-incremento: " + ++contador);
        System.out.println("Valor del post-incremento: " + contador++);
        System.out.println("valor del pre-decremento: " + --contador);
        System.out.println("Valor del post-decremento: " + contador--);
        System.out.println("Valor final del contador: " + contador);

        //los post operadores usan el valor actual y luego incrementan o decrementan
        //los pre operadores incrementan o decrementan y luego usan el valor nuevo
    }
}