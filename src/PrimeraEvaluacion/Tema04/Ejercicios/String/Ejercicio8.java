package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

/*
Ejercicio 8
Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos y a continuación muestre las iniciales en mayúsculas.

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        String inciales = nombre.substring(0,1);

        for (int i = 0; i < nombre.length() - 2; i++) {
            if (nombre.substring(i, (i + 1)).equals(" ")){
                inciales = inciales + nombre.substring(i +1,i + 2);
            }
        }
        System.out.println(inciales);
    }
}
