package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        // tu código aquí
        int contador = 5;
        System.out.println("El valor inicial del contador es: " + contador);
        int contador2 = ++contador;
        System.out.println("el valor ha aumentado, ahora es: " + contador);
        int contador3 = contador2++;
        System.out.println("el valor ahora ha vuelto a aumentar, ahora es: " + contador2);
        int contador4 = --contador3;
        System.out.println("el valor ha disminuido, ahora es: " + contador3);
        int contador5 = contador4--;
        System.out.println("el valor ahora ha disminuido, ahora es: " + contador4);
        //el pre-incremento funciona incrementando el valor de la variable "contador" en uno antes de que se utilice el nuevo valor en la expresión actual. A diferencia del post-incremento, que usa el valor original de la variable y luego lo incrementa
    }
}
