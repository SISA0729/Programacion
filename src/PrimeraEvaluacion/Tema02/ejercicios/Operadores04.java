package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores04 {
    public static void main(String[] args) {
        System.out.println("----------Ejercicio 4----------");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de ardillas: ");
        int ardillas = teclado.nextInt();
        System.out.println("Numero de nueces: ");
        int nueces = teclado.nextInt();
        int resto2 = nueces % ardillas;
        int divi2 = nueces / ardillas;
    }
}
