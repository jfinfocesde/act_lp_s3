package com.example;

public class Ejercicio5 {
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        
        // Precio con descuento
        double precio = 100.0;
        System.out.println("Precio inicial: " + precio);
        precio *= 0.85;
        System.out.println("Precio después del 15% de descuento: " + precio);

        // Concatenación de cadenas
        String mensaje = "Hola";
        System.out.println("Mensaje inicial: " + mensaje);
        mensaje += " Mundo";
        System.out.println("Mensaje concatenado: " + mensaje);

        // Puntos con operaciones compuestas
        int puntos = 50;
        System.out.println("Puntos iniciales: " + puntos);
        puntos *= 2;
        System.out.println("Puntos después de duplicar: " + puntos);
        puntos += 25;
        System.out.println("Puntos después de bonificación: " + puntos);

        // Explicación con las variables reales:
        // - precio *= 0.85 → multiplica el precio por 0.85 (aplica descuento).
        // - mensaje += " Mundo" → concatena texto al final.
        // - puntos *= 2 → multiplica los puntos por 2.
        // - puntos += 25 → suma 25 puntos adicionales.
    }
}
