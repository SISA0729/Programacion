package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una cadena: ");
        String cadena = teclado.nextLine();
        System.out.println("Ahora introduce el texto que quieres comprobar si esta: ");
        String texto = teclado.nextLine();

        if (cadena.contains(texto)){
            System.out.println("Si, el texto " + texto + "\" esta dentro de " + cadena + "\"");
        }
        else {
            System.out.println("No se encuentra en la cadena");
        }

    }
}
