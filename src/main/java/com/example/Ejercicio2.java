package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
     int a = 10, b = 3;
        int divisionEntera = a / b;
        double divisionDecimal = (double) a / b;
        double x = 15.5, y = 4.2;
        double divisionDecimales = x / y;
        System.out.println("División entera: " + divisionEntera);
        System.out.println("División decimal: " + divisionDecimal);
        System.out.println("División de decimales: " + divisionDecimales);
        // La división entera descarta la parte decimal, mientras que la decimal la conserva.
        
    }
}
