package com.example;

public class Ejercicio5 {
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        
        double precio = 100.0;
        System.out.println("El valor inicial de precio es: " + precio);
        
        precio*=0.85;   
        System.out.println("El precio con descuento es: " + precio + "\n");

        String mensaje = "Hola";
        System.out.println(mensaje += " mundo" + "\n");

        int puntos = 50;
        System.out.println("El valor inicial de puntos es: " + puntos);

        puntos *= 2;
        System.out.println("El valor de puntos después de multiplicar por 2 es: " + puntos);
        puntos +=25;
        System.out.println("El valor de puntos después de sumar 25 es: " + puntos);
  

    }
}
