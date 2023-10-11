package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores08 {
    public static void main(String[] args) {
        System.out.println("----------Ejercico 8----------");
        Scanner cifro = new Scanner(System.in);
        System.out.println("Introduce dos cifras: ");
        int cifra = cifro.nextInt();
        int cifra1 = cifra % 10;
        int cifra2 = cifra / 10;

        int numeroinvertido = cifra1 * 10 + cifra2;

        System.out.println("El numero invertido es: "+ numeroinvertido);
    }
}
