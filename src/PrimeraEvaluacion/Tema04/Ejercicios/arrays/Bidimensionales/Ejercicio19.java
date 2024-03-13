package PrimeraEvaluacion.Tema04.Ejercicios.arrays.Bidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] numeros = new int[5][5];
        Random generador = new Random();
        int[] fila = new int[5];
        int[] columna = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = generador.nextInt(1, 11);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fila[i] = fila[i] + numeros[i][j];
            }
        }
        System.out.println(Arrays.toString(fila));
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                fila[i] = fila[i] + numeros[i][j];
            }
        }
    }
}
