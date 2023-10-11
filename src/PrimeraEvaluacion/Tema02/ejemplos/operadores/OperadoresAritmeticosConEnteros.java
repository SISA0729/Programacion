package PrimeraEvaluacion.Tema02.ejemplos.operadores;

import java.util.Scanner;

public class OperadoresAritmeticosConEnteros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        int sumas = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;
        int resto = num1 % num2;

        System.out.println(num1 + " + " + num2 + "= " + sumas);
        System.out.println(num1 + " - " + num2 + "= " + resta);
        System.out.println(num1 + " * " + num2 + "= " + multi);
        System.out.println(num1 + " / " + num2 + "= " + divi);
        System.out.println(num1 + " % " + num2 + "= " + resto);

        // resto de la división entera o modulo

    }
}
