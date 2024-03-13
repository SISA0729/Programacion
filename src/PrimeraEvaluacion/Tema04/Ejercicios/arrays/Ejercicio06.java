package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] longitud = new int[20];

        Random generador = new Random();

        double media1 = 0;
        double media2 = 0;
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < longitud.length; i++) {
            longitud[i] = generador.nextInt(-10,11);

            if (longitud[i] > 0){
                suma1 += longitud[i];
                media1 = suma1 / 20.0;
            }
            if (longitud[i] < 0){
                suma2 += longitud[i];
                media2 = suma2 / 20.0;
            }
        }
        System.out.println(Arrays.toString(longitud));
        System.out.println("Media Positivos = " + media1);
        System.out.println("Media Negativos = " + media2);
    }
}
