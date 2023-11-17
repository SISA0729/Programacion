package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        boolean johan = n1 != n2 && n1 != n3 && n2 != n3;
        System.out.println(johan);
    }
}
