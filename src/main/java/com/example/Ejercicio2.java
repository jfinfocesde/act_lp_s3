package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        // tu código aquí
        int a = 10;
        int b = 3;
        int divisionEntera = a / b;
        double divisionDecimal = (double) a / b;
        double x = 15.5;
        double y = 4.2;
        double divisionDecimales2 = x / y;
        System.out.println("El resultado de la división entera es: " + divisionEntera + "que es a (10)/ b (3)");
        System.out.println("El resultado de la división decimal es: " + divisionDecimal + "que es a (10)/ b (3)"
        );
        System.out.println("El resultado de la división decimal nro 2 es : " + divisionDecimales2 + "que es x (15.5)/ y (4.2)");
        //en la division entera se usaron números enteros ya que "int" solo guarda numeros enteros y en cambio double guarda tambien decimales
    }
}
