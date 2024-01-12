package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio01ConFor {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(); teclado.nextLine();
        while (numero != -1){
            if (numero >= 0){
                numeros.add(numero);
            }
            numero = teclado.nextInt(); teclado.nextLine();
        }
        System.out.println(numeros);

        for (Integer elemento: numeros) {
            if (elemento % 2 == 0){
                System.out.println(elemento);
            }
        }
        System.out.println();



    }
}
