package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {

        // Declaración de variables tipo int
        int a = 10;
        int b = 3; 

        // División entera 
        int divisionEntera = a/b; 
        System.out.println("El resultado de la división entera es: " + divisionEntera);

        // División decimal 
        double divisionDecimal = (double) a /b; 
        System.out.println("El resultado de la división decimal es: " + divisionDecimal);

        //El resultado es diferente porque en la primera se uso una variable int (enteros) y en la otra una tipo double (decimales)

        // Declaración de variables tipo double
        double x = 15.5;
        double y = 4.2;

        // División de decimales 
        double divisionDecimales = x/y;
        System.out.println("El restultado de la división de decimales es: " + divisionDecimales);
    }
}
