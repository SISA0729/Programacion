package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercico28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        System.out.println("Los multiplos de 5 entre 1 y " + n + " som");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
