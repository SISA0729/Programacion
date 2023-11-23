package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        // creo el array
        int[] array = new int[tamaño];
        System.out.println(Arrays.toString(array));
        // tengo que ir llenándolo con números introducidos por teclado, pero sólo si son positivos
        int numero = teclado.nextInt();
        int indice = 0;
        while (numero > 0 && indice < tamaño) {
            // si el número es positivo y el índice está dentro del array
            array[indice] = numero;
            // tengo que incrementar el índice a la siguiente posición
            indice++;
            if (indice < tamaño) { // o bien poner tamaño - 1 en la condición del while
                numero = teclado.nextInt(); // antes de salir tengo que pedir un nuevo número
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
