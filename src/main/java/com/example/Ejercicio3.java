package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {

        int contador = 5;
        System.out.println("Valor inicial del contador: " + contador);
        // Diferencia entre pre-incremento y post-incremento:
        // 'contador++' usa el valor actual de la variable en la expresión y luego
        // incrementa su valor.
        // El valor de 'contador' se usa primero para la impresión (5), y luego se
        // incrementa a 6.
        // '++contador' incrementa el valor de la variable ANTES de que su valor sea
        // usado en la expresión.

        System.out.println("Pre-incremento (++contador): " + ++contador);
        // El valor de 'contador' se incrementa primero a 6, y luego se usa para la
        // impresión (6).

        System.out.println("Post-incremento (contador++): " + contador++);
        // El valor de 'contador' se usa primero para la impresión (6), y luego se
        // incrementa a 7.

        System.out.println("Valor del contador después del post-incremento: " + contador);
        // El valor actual de 'contador' es ahora 7.

        System.out.println("Pre-decremento (--contador): " + --contador);
        // El valor de 'contador' se decrementa primero a 6, y luego se usa para la
        // impresión (6).

        System.out.println("Post-decremento (contador--): " + contador--);
        // El valor de 'contador' se usa primero para la impresión (6), y luego se
        // decrementa a 5.

        System.out.println("Valor del contador después del post-decremento: " + contador);
        // El valor actual de 'contador' es ahora 5.

    }
}
