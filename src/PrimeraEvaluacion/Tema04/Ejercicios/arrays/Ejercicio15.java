package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        Random generador = new Random();

        for (int i = 0; i < 10; i++) {
            enteros[i] =generador.nextInt(1,10);
        }
        System.out.println(Arrays.toString(enteros));

        int impares = 0;
        int pares = 0;
        for (int num: enteros) {
            if (num % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }

        System.out.println(pares);
        System.out.println(impares);

    }
}
