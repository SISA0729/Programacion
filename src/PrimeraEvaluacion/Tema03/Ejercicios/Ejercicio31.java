package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
