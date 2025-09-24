public class Ejercicio2 {
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");

        int a = 10;
        int b = 3;

        
        int divisionEntera = a / b;
        System.out.println("División entera (10 / 3): " + divisionEntera);  // Resultado: 3

        
        double divisionDecimal = (double) a / b;
        System.out.println("División decimal (10 / 3): " + divisionDecimal);  // Resultado: 3.333...

        double x = 15.5;
        double y = 4.2;

        
        double divisionDecimales = x / y;
        System.out.println("División de decimales (15.5 / 4.2): " + divisionDecimales);  // Resultado: 3.690...

        // Explicación:
        // La división entre enteros descarta los decimales y da un número entero (se trunca).
        // Al convertir uno de los operandos a double, el resultado conserva los decimales.
        // Cuando ambos operandos son double, se obtiene una división con decimales completa.
    }
}
