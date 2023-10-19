package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = teclado.nextInt();
        System.out.print("Caracter: ");
        char caracter = teclado.next().charAt(0);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}
