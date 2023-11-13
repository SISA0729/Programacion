package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {
        int[] notas = new int[5];
        Random generador = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = generador.nextInt(0,11);
        }
        System.out.println(Arrays.toString(notas));

        int suma = notas[0] +notas[1] + notas[2] + notas[3] + notas[4];
        double media = suma / 5.0;
        System.out.printf("La media: %.2f", media);
        System.out.println();
        Arrays.sort(notas);
        System.out.println("La nota mas alta: " + notas[4]);
        System.out.println("La nota mas baja: " + notas[0]);
    }
}
