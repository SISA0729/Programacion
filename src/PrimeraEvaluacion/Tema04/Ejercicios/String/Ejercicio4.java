package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una Ciudad: ");
        String ciudad = teclado.nextLine();

        System.out.println(ciudad.endsWith("burgo"));
    }
}
