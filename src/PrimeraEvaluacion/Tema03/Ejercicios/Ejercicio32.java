package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        while (numero < 1 || numero > 100) {
            System.out.println("Error: El número está fuera del rango (1-100)");
            numero =teclado.nextInt();
        }
        System.out.println(numero);

    }
}

