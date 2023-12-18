package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            numero.add(teclado.nextInt());
        }
        Collections.reverse(numero);
        System.out.println(numero);
    }
}
