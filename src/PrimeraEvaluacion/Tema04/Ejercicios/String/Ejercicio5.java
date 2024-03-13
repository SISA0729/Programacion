package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir un texto: ");
        String texto = teclado.nextLine();
        boolean inicio = texto.startsWith("J");

        if (inicio){
            System.out.println("Si empieza por J");
        }
        else {
            System.out.println("Esta palabra no");
        }
    }
}
