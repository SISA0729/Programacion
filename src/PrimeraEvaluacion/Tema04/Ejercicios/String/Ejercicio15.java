package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        char caracter = teclado.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println("Aparece " + contador + " veces ");
    }
}
