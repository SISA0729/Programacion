package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class EjercicioHuelga {
    public static void main(String[] args) {
        int[] elemntos = new int[60];
        Random generador = new Random();

        for (int i = 0; i < 60; i++) {
            elemntos[i] =generador.nextInt(1,5);
        }
        System.out.println(Arrays.toString(elemntos));
        int pares = 0;
        for (int i = 0; i < elemntos.length; i++) {

        }
        System.out.println(pares);

    }
}
