package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota de la Primera Evaluacion: ");
        int primera = teclado.nextInt();
        System.out.println("Nota de la Segunda Evaluacion. ");
        int segunda = teclado.nextInt();
        System.out.println("Nota de la Tercera Evaluacion: ");
        int tercera = teclado.nextInt();
        int suma = primera + segunda + tercera;
        double media = suma / 3.0;

        System.out.printf("La nota FINAL es: %.1f", media);

    }
}
