package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random generador = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = generador.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);  //Ordena de menor a mayor
        System.out.println(Arrays.toString(array));

        for (int i = array.length -1; i > 10 ; i--) {
           array[i] = array[array.length -i];
        }
    }
}
