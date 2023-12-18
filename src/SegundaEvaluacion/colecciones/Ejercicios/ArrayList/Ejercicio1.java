package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            numero.add(teclado.nextInt());
        }
        System.out.println(numero);

    }
}
