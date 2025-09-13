package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int a = 10;
        int b = 3;

        int divisionEntera = a / b;
        System.out.println("La división entera de " + a + " y " + b + " es igual a: " + divisionEntera);

        double divisionDecimal = (double) a / b;
        System.out.println("La división decimal de " + a + " y " + b + " es igual a: " + divisionDecimal);

        double x = 15.5;
        double y = 4.2;

        double divisionDecimales = x / y;
        System.out.println("La división decimal de " + x + " y " + y + " es igual a: " + divisionDecimales);

        // la división entre enteros siempre da un resultado entero, truncando cualquier parte decimal.
        // Para obtener un resultado decimal, al menos uno de los operandos debe ser de tipo  double
        // en divisiondecimales ambos son double por lo tanto el resultado es decimal
} 

}
