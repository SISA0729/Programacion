package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        double[] decimales = new double[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < decimales.length; i++) {
            double numero = teclado.nextDouble();
            decimales[i] = numero;
        }
        for (int i = decimales.length -1; i >= 0; i--) {
            System.out.print(decimales[i] + " ");
        }
    }
}
