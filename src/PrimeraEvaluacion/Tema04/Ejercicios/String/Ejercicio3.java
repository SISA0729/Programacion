package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una cadena: ");
        String cadena = teclado.nextLine();

        String remplazo = cadena.replace('a', 'b');


        System.out.println(remplazo);
    }
}
