package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operaciones03 {
    public static void main(String[] args) {
        System.out.println("----------Ejercicio 3----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor entero n: ");
        int n = sc.nextInt();

        int resultado = ((n + 1) * n + 2) * n + 3;

        System.out.println("((n + 1) * n + 2) * n + 3: " + resultado);

    }
}
