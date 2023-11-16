package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArrayBidimension {
    public static void main(String[] args) {

        int[][] tabla = {
                {1, 2, 3, 1}, // primer array de enteros
                {3, 4, 1, 2}, // segundo array de enteros
                {4, 4, 1, 0}  // tercer array de enteros
        };
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));
        System.out.println(tabla[1][2]);
        System.out.println(tabla[0][0]);
        System.out.println(tabla[tabla.length -1][0]);
        System.out.println(tabla[0][tabla[0].length -1]);
        System.out.println(tabla[2][tabla[2].length -1]);
        System.out.println();
        char[][] caracteres = new char[6][4];
        Random generador = new Random();
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                caracteres[i][j] = (char) generador.nextInt(64,95);
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                System.out.print(caracteres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(caracteres[3][2]);

    }
}
