package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        int contador = 5;
        System.out.println("Valor inicial del contador: " + contador);
        ++contador;
        System.out.println("Aplicando preincremento: " + contador);
        contador++;
        System.out.println("Aplicando postincremento: " + contador);
        --contador;
        System.out.println("Aplicando predecremento: " + contador);
        contador--;
        System.out.println("Aplicando postdecremento: " + contador);    

        /*
         * EXPLICACIÓN:
         * - Pre-incremento (++contador): el valor se incrementa ANTES de ser usado en la expresión.
         * - Post-incremento (contador++): el valor se usa en la expresión y LUEGO se incrementa.
         * - Lo mismo aplica para decremento (--contador y contador--).
         * 
         * Este comportamiento es útil cuando se usan estos operadores dentro de otras operaciones
         * o estructuras como bucles.
         */

    }
    public static void main(String[] args) {
        ejercicio3();
    }
}
