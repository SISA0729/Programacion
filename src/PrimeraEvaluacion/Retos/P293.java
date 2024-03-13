package PrimeraEvaluacion.Retos;
/*
    1.  insectos 6 patas
    2.  aracnidas 8 patas
    3.  crusyacios 10 patas
    4.  escolopendra
    5.  n de anillos de la escolopendra
 */

import java.util.Arrays;
import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int casos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < casos; i++) {
            String liena = teclado.nextLine();
            String[] elementosdelinea = liena.split(" ");
            System.out.println(Arrays.toString(elementosdelinea));

            int[] numeros = new int[5];

            for (int j = 0; j < 5; j++) {
                numeros[j] = Integer.parseInt(elementosdelinea[j]);
            }
            int resultado = (numeros[0] * 6) + (numeros[1] * 8) + (numeros[2] * 10) + ((numeros[3]  * numeros[4]) * 2);
            System.out.println(resultado);



        }
        teclado.close();
    }
}
