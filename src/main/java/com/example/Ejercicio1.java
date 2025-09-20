package com.example;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        int x = 10;
        int y = 5;
        int resultadoSuma = x + y;
        System.out.println("La suma de " + x + " y " + y + " es: " + resultadoSuma  );
        int resultadoResta = x - y;
        System.out.println("La resta de " + x + " y " + y + " es: " + resultadoResta  );
        int resultadoMultiplicacion = x * y;
        System.out.println("La multiplicacion de " + x + " y " + y + " es: " + resultadoMultiplicacion  );
        int resultadoDivision = x / y;
        System.out.println("La division de " + x + " y " + y + " es: " + resultadoDivision  );
        int resultadoModulo = x % y;
        System.out.println("El modulo de " + x + " y " + y + " es: " + resultadoModulo  );  

        System.out.println("Suma: " + x + " + " + y + " = " + resultadoSuma);
        System.out.println("Resta: " + x + " - " + y + " = " + resultadoResta);
        System.out.println("Multiplicación: " + x + " * " + y + " = " + resultadoMultiplicacion);
        System.out.println("División entera: " + x + " / " + y + " = " + resultadoDivision);
        System.out.println("Módulo: " + x + " % " + y + " = " + resultadoModulo);

    }

    public static void main(String[] args) {
        ejercicio1();

}
}
