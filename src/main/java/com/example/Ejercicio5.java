package com.example;

public class Ejercicio5 {
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");

     
        double precio = 100.0;
        precio *= 0.85; // aplica descuento del 15%
        System.out.println("Precio con descuento del 15%  " + precio);

       
        String mensaje = "Hola";
        mensaje += " Mundo";
        System.out.println("Mensaje concatenado  " + mensaje);

       
        int puntos = 50;
        puntos *= 2; // duplica los puntos
        System.out.println("Puntos duplicados  " + puntos);

        puntos += 25; // aplica bonificación
        System.out.println("Puntos con bonificación  " + puntos);
    }
}

