package com.example;

public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        // tu código aquí
        int a = 10;
        int b = 5;
        int divisionEntera = a / b;
        
        System.out.println("El resultado de la división entera es: " + divisionEntera);
        
        double divisionDecimal = (double) a / b;
        System.out.println("El resultado de la división decimal es: " + divisionDecimal);
        
        double x = 15.5;
        double y = 4.2;

        double divisionDecimal2 = x / y;

        System.out.println("El resultado de la división decimal es:(15.5 / 4.2): " + divisionDecimal2);

        //cuando dividimos dos valores int, el resultado también es un int. Si queremos un resultado decimal, al menos uno de los valores debe ser double.
        //Para obtener un resultado decimal, necesitamos convertir al menos uno de los operandos a double.
        //Cuando ambos operandos son double, Java realiza una división con punto flotante, conservando los decimales.
        
    }
}
