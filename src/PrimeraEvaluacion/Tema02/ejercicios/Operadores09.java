package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero de 3cifras: ");
        int numero = teclado.nextInt();
        int cifra1 = numero / 100;
        int cifra2 = (numero / 10) % 10;
        int cifra3 = numero % 10;
        System.out.println(cifra3 + "" + cifra2 + "" + cifra1);
    }
}
