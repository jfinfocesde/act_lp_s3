package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        int a = 10;
        int b = 3;
        
        // Cuando se divide dos enteros, Java realiza una división entera,
        // esto significa que como resultado solo conserva la parte entera,
        // y asi esta descarta cualquier tipo de residuo o decimal.

        int divisionEntera = a / b;
        // Al comvertirlo a un 'double' se realiza una división decimal y el resultado incluye la parte fraccionaria.


        double divisionDecimal = (double) a / b;
        double x = 15.5;
        double y = 4.2;

        // Cuando ambos operandos son de tipo 'double' java realiza automáticamente una división de punto-
        // flotante para obtener el resultado completo.
        double divisionDecimales = x / y;

        System.out.println("División entera de " + a + " / " + b + " = " + divisionEntera);
        System.out.println("División decimal de " + a + " / " + b + " = " + divisionDecimal);
        System.out.println("División decimal de " + x + " / " + y + " = " + divisionDecimales); 

    }
}
