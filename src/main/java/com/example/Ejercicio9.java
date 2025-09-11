package com.example;

public class Ejercicio9 {
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a == b : " + ("igualdada"));
        }
        if (a != b) {
            System.out.println("a != b : " + ("desigualdad"));
        }
        if (a < b) {
            System.out.println("a < b  : " + ("menor que"));
        }
        if (a < b) {
            System.out.println("a > b  : " + ("mayor que"));
        }
        if (a <= b) {
            System.out.println("a <= b : " + ("menor o igual que"));
        }
        if (a >= b) {
            System.out.println("a >= b : " + ("mayor o igual que"));
        }
        String texto1 = "Hola";
        String texto2 = "Hola";
        if (texto1.equals(texto2)) {
            System.out.println("Los textos son iguales");
        } else {
            System.out.println("Los textos son diferentes");
        }
    }
}
