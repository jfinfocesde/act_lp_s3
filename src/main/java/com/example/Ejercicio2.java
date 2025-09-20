package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int a = 10;
        int b = 3;
        int divisionEntera = a / b;
        double divisionDecimal = a / b;
        double x = 15.5;
        double y = 4.2;
        double divisionDecimales = x / y;
        System.out.println("División entera (int): " + a + " / " + b + " = " + divisionEntera);
        System.out.println("División decimal: " + a + " / " + b + " = " + divisionDecimal);
        System.out.println("División con decimales: " + x + " / " + y + " = " + divisionDecimales);

        /*
         * La división entre dos enteros (int / int) en Java siempre da como resultado un entero,
         * descartando cualquier parte decimal. Por eso, 10 / 3 = 3 (no 3.333...).
         *
         * Si uno de los operandos es un número decimal (double), Java realiza una división decimal,
         * conservando los decimales. Al hacer (double) a / b, estamos forzando que la operación
         * se haga en tipo double: 10.0 / 3 = 3.333
         * Cuando se usa variables double, como 15.5 / 4.2, Java realiza la operación
         * en punto flotante y conserva la precisión decimal.
         */
    }

    public static void main(String[] args) {
        ejercicio2();
    }
}

