package com.example;

public class Ejercicio5 {
    public static void ejercicio5() {

        // Declaración de variables
        double precio = 100.0;
        String mensaje = "Hola";
        int puntos = 50; 

        // Descuento
        double descuento = precio *= 0.85;
        System.out.println(descuento);

        // Mensaje concatenado
        System.out.println(mensaje += " Mundo");

        // Duplicar puntos
        int puntosDuplicados = puntos *= 2;
        System.out.println("Los puntos duplicados es: " + puntosDuplicados);

        // Bonificación 
        int bonificación = puntos += 25;
        System.out.println("La bonificación es: " + bonificación);
    
    }
}
