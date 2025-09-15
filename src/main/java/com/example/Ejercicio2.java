package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        // Parte 1: división entera vs decimal con int
        int a = 10;
        int b = 3;

        int divisionEntera = a / b; // int/int -> trunca: 3
        double divisionDecimal = (double) a / b; // double/int -> real: 3.333...

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("División ENTERA a / b = " + divisionEntera);
        System.out.println("División DECIMAL a / b = " + divisionDecimal);

        // Parte 2: división con double
        double x = 15.5;
        double y = 4.2;
        double divisionDecimales = x / y;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("División con decimales x / y = " + divisionDecimales);

        // Explicación breve:
        // - Si ambos son int -> división entera (trunca).
        // - Si al menos uno es double -> división real (con decimales).
        // - Double pueden mostrar muchos dígitos por la representación IEEE-754.
    }
}
