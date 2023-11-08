package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        double[] decimales = new double[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < decimales.length; i++) {
            double numero = teclado.nextDouble();
            decimales[i] = numero;
        }
        System.out.println(Arrays.toString(decimales));
    }
}
