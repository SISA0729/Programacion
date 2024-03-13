package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArrayTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();  // PARA QUE NO SALTE A LA HORA DE METER UN DATO
        String[] cadenas = new String[n];

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = teclado.nextLine();
        }
        System.out.println(Arrays.toString(cadenas));
    }
}
