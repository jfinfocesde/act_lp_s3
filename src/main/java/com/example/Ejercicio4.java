package com.example;

public class Ejercicio4 {
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        // Suma compuesta
        numero += 5;
        System.out.println("Después de numero += 5 → " + numero);

        // Resta compuesta
        numero -= 3;
        System.out.println("Después de numero -= 3 → " + numero);

        // Multiplicación compuesta
        numero *= 2;
        System.out.println("Después de numero *= 2 → " + numero);

        // División compuesta
        numero /= 4;
        System.out.println("Después de numero /= 4 → " + numero);

        // Módulo compuesto
        numero %= 3;
        System.out.println("Después de numero %= 3 → " + numero);

        // Explicación:
        // - numero += 5 → suma 5 al valor actual.
        // - numero -= 3 → resta 3 al valor actual.
        // - numero *= 2 → multiplica por 2 el valor actual.
        // - numero /= 4 → divide entre 4 el valor actual (división entera).
        // - numero %= 3 → guarda el residuo de dividir entre 3.
    }
}
