package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;

public class ComprobarOrdenArray {
    public static void main(String[] args) {

        int[] array1 = {0,1,6,-3,12};
        int[] array2 = {-5, 10, 16, 18, 100};
        int[] array3 = {8,6,3,-1,-5};

        boolean ordenAscendente = true;

        for (int i = 0; i < 4; i++) {
            if (array1[i] > array1[i + 1]) {
                ordenAscendente = false;
                break; // nos saca fuera de for
            }
        }
        System.out.println("Array 1: " + ordenAscendente);

        if (ordenAscendente){
            System.out.println("Ordenado ascendente");
        }else {
            boolean ordenDescendente = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < array1[i +1]){
                    ordenDescendente = false;
                    break;
                }
            }
            if (ordenDescendente){
                System.out.println("Ordenado descendente");
            }else {
                System.out.println("ESTA DESORDENADO");
            }
        }
    }
}

