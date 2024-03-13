package PrimeraEvaluacion.Tema03.masEjercicios;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("DIme un numero: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\n ");
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
