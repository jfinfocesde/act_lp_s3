package com.example;

public class Ejercicio4 {
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        
        int numero = 10;
        System.out.println("El valor inicial de numero es: " + numero);
        numero += 5 ; // suma 5 al valor actual de numero
        System.out.println("numero es igual a 10, " + " Después de += 5, el valor de numero es: " + numero);

        numero -= 3 ; // resta 3 al valor actual de numero
        System.out.println("resta el valor actual q es 15 a, " + " Después de -= 3, el valor de numero es: " + numero);

        numero *= 2 ; // multiplica el valor actual de numero por 2
        System.out.println("el valor actual es 12, " + " Después de *= 2, el valor de numero es: " + numero);

        numero /= 4 ; // divide el valor actual de numero por 4
        System.out.println("el valor actual es 24, " + " Después de /= 4, el valor de numero es: " + numero);

        int modulo = 3;
        modulo %= 3 ; // asigna a modulo el resto de dividir su valor actual por 3
        System.out.println("el valor actual es 6, " + " Después de %= 3, el valor de modulo es: " + modulo);
        

    }
}
