package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class RellenarArrayRambom {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int max = 1000;
        int min = -1000;

        Random generador = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(min,max +1);
        }
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }


}
