package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        // tu código aquí
        
        // División entera: se descarta la parte decimal
        int divisionEntera = a / b;
        System.out.println("División entera (10 / 3): " + divisionEntera);

        // División decimal: se convierte 'a' a double antes de dividir
        double divisionDecimal = (double) a / b;
        System.out.println("División decimal (10.0 / 3): " + divisionDecimal);

        double x = 15.5, y = 4.2;

        // División entre decimales
        double divisionDecimales = x / y;
        System.out.println("División entre decimales (15.5 / 4.2): " + divisionDecimales);
    }
}
