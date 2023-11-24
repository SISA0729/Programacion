package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        int[] enteros = new int[10];
        Random generador = new Random();
        int C1 = 0;
        int C2 = 0;
        int C3 = 0;
        int C4 = 0;
        int C5 = 0;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] =generador.nextInt(1,10);
            if (enteros[i] == 1){
                C1++;
            }else if (enteros[i] == 2){
                C2++;
            }else if (enteros[i] == 3){
                C3++;
            }else if (enteros[i] == 4){
                C4++;
            }else if (enteros[i] == 5){
                C5++;
            }
        }
        System.out.println(Arrays.toString(enteros));
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);


    }
}
