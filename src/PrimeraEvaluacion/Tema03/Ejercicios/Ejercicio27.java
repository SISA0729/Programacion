package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial *i;

        }
        System.out.println("EL FACTORIAL ES: " + factorial);
    }
}
