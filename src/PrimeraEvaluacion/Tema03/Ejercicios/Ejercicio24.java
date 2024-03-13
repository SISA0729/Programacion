package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de altura: ");
        int n1 = teclado.nextInt();
        System.out.println("Numero de ancho: ");
        int n2 = teclado.nextInt();
        System.out.println("Caracter: ");
        char caracter = teclado.next().charAt(0);


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}

