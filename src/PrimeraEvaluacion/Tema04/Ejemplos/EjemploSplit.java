package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;

public class EjemploSplit {
    public static void main(String[] args) {
        String cadena = "1 2 3 4 5 6 7 8 9 10";
        String[] array = cadena.split(" ");
        System.out.println(Arrays.toString(array));

        int[] numeros = new int[array.length];

        String uno = "1";
        String dos = "2";
        String suma = uno + dos;
        System.out.println(suma);

        int n1 = Integer.parseInt(uno);
        int n2 = Integer.parseInt(dos);
        int suma1 = n1 + n2;
        System.out.println(suma1);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(array[i]);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(numeros[0] + numeros[1] + numeros[2]);
    }
}
