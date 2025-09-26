package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        int a = 10, b = 3;
        // El resultado es 3 porque Java ignora la parte decimal cuando divide dos
        // enteros.
        int divisionEntera = a / b;

        // El resultado es 3.333... porque al convertir 'a' a double antes de la
        // división, Java realiza la operación como una división de punto flotante.
        double divisionDecimal = (double) a / b; //

        double x = 15.5, y = 4.2; // variables de tipo double

        // El resultado es 3.69... porque ambos operandos son double, lo que hace que
        // Java realice una división de punto flotante por defecto.
        double divisionDecimales = x / y;

        System.out.println("División entera (10 / 3): " + divisionEntera);
        System.out.println("División con decimales (10 / 3): " + divisionDecimal);
        System.out.println("División con decimales (15.5 / 4.2): " + divisionDecimales);
    }
}
