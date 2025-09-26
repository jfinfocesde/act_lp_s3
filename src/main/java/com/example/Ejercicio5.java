package com.example;

public class Ejercicio5 {
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        
        double precio = 259.0;
        precio *= 0.85; // Aplicar un descuento del 15%
        System.out.println("Precio con descuento del 15%: " + precio);

        String mensaje = "Hola";
        mensaje += " mundo"; // Concatenar una cadena
        System.out.println(mensaje);

        int puntos = 50;
        puntos *= 2; // Duplicar los puntos
        puntos += 25; // Añadir 25 puntos adicionales
        System.out.println("Total de puntos: " + puntos);
    }
}
