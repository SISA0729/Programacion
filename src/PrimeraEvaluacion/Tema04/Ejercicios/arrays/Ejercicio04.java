package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];

        Random generador = new Random();

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println(suma);
    }
}
