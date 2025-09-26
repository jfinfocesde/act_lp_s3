package com.example;

public class Ejercicio9 {
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        
        int a = 10, b = 20;
        System.out.println("¿a es igual a b?: " + (a == b));
        System.out.println("¿a es diferente de b? " + (a != b));
        System.out.println("¿a es menor que b? " + (a < b));
        System.out.println("¿a es mayor que b? " + (a > b));
        System.out.println("¿a es menor o igual que b? " + (a <= b));
        System.out.println("¿a es mayor o igual que b? " + (a >= b)); 

        String texto1 = "Hola";
        String texto2 = "Hola";

        // Evaluación de comparación de cadenas
        System.out.println("¿texto1 es igual a texto2? " + texto1.equals(texto2));
    }
}
