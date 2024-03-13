package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2= teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2 + num3 + num4;
        double media = suma / 4.0;
        System.out.println("Suma= " + suma);
        System.out.println("Media= " + media);
    }
}
