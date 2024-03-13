package SegundaEvaluacion.poo.metodos;

import java.util.Scanner;

public class EjemplosMetodos {
    public static void main(String[] args) {
        // Pedimos el primer número
        double num1 = pedirNumero();
        // Pedimos el segundo número
        double num2 = pedirNumero();
        // Mostramos el menú y guardamos la opción que devuelve
        int opcion = mostrarMenu();
        // realizamos la operación solicitada
        realizarOperacion(opcion, num1, num2);

    }

    public static double pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return teclado.nextDouble();
    }
    // creamos una calculadora de números decimales -> creamos o declaramos cuatro métodos
    // suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // multiplica
    public static double multiplica(double a, double b) {
        return a * b;
    }

    // divide
    public static double divide(double a, double b) {
        return a / b;
    }

    // método que muestre un menú con las 4 opciones y devuelva la opción elegida
    public static int mostrarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Elige una de las opciones (1-4)");
        return teclado.nextInt();
    }

    public static void realizarOperacion(int opcion, double numero1, double numero2) {
        double resultado = 0;
        String signo = "";
        switch (opcion) {
            case 1:
                resultado = suma(numero1, numero2);
                signo = " + ";
                break;
            case 2:
                resultado = resta(numero1, numero2);
                signo = " - ";
                break;
            case 3:
                resultado = multiplica(numero1, numero2);
                signo = " x ";
                break;
            case 4:
                resultado = divide(numero1, numero2);
                signo = " / ";
                break;
            default:
                System.out.println("Operación incorrecta.");
                break;
        }
        // mostramos el resultado
        if (!signo.equals("")) {
            System.out.printf("%.2f %s %.2f = %.2f", numero1, signo, numero2, resultado);
        }
    }
}
