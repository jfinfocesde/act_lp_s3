package com.example;

public class Ejercicio10 {
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");

        // Variables enteras
        int a = 10;
        int b = 3;

        // División entera 
        int divisionEntera = a / b;

        // División decimal 
        double divisionDecimal = (double) a / b;

        // Variables decimales
        double x = 15.5;
        double y = 4.2;

        // División con decimales
        double divisionDecimales = x / y;

        // Impresión de resultados
        System.out.println("División entera " + a + " / " + b + " = " + divisionEntera);
        System.out.println("División decimal " + a + " / " + b + " = " + divisionDecimal);
        System.out.println("División entre decimales " + x + " / " + y + " = " + divisionDecimales);

        /*
         * Explicación:
         * - En la división entera (int / int), el resultado también es un entero,
         *   por lo tanto los decimales se descartan (10 / 3 = 3).
         * - Al convertir a double, obtenemos una división con decimales
         *   y el resultado ya no pierde precisión (10 / 3 ≈ 3.3333).
         * - Cuando trabajamos directamente con doubles, la operación se realiza
         *   en punto flotante y el resultado incluye la parte decimal completa.
         */

    }
}
