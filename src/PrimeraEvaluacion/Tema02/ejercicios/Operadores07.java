package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores07 {
    public static void main(String[] args) {
        System.out.println("----------Ejercicio 7----------");
        Scanner numero = new Scanner(System.in);
        System.out.println("Numero de dos digitos: ");
        int valor2 = numero.nextInt();
        int decenas = valor2 / 10;

        System.out.println(decenas);
    }
}
