package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        //es una manera de recorrer arrays alternativa al for normal
        int[] nombreArray = {1,2,4,8,16,32,64,128,256,512,1024};

        Random generador = new Random();
        for (int valor:nombreArray) {
            System.out.println(valor *2);

        }
        String cadena = "es una manera de recorrer arrays alternativa al for normal\n";
        //SI QUIERO METER ARRAY DE CARACTERES TODAS LAS LETRAS DE UN STRING
        char[] letras = cadena.toCharArray();

        //quiero hacer un array que guarde el numero de 'a', el numero de 'e' el numero de 'i' etc.....
        System.out.println("cadena tiene " + letras.length + " caracter: " + Arrays.toString(letras));

        int[] contadores = new int[5];
        //contadores[0] guardara 'a'
        //contadores[1] guardara 'e' ... y asi sucesivamente

        for (char valor:letras) {
            if (valor == 'a'){
                contadores[0]++;
            }else if (valor == 'e'){
                contadores[1]++;
            }else if (valor == 'i'){
                contadores[2]++;
            } else if (valor == 'o') {
                contadores[3]++;
            } else if (valor == 'u') {
                contadores[4]++;
            }
        }
        System.out.println("Numero de 'a' = " + contadores[0]);
        System.out.println("Numero de 'e' = " + contadores[1]);
        System.out.println("Numero de 'i' = " + contadores[2]);
        System.out.println("Numero de 'o' = " + contadores[3]);
        System.out.println("Numero de 'u' = " + contadores[4]);
    }
}
