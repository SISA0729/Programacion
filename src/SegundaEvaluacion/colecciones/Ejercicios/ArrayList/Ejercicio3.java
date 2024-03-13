package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        System.out.println("A1: ");
        a1.add(teclado.nextInt());
        a1.add(teclado.nextInt());
        a1.add(teclado.nextInt());
        a1.add(teclado.nextInt());
        a1.add(teclado.nextInt());
        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.println("A2: ");
        a2.add(teclado.nextInt());
        a2.add(teclado.nextInt());
        a2.add(teclado.nextInt());
        a2.add(teclado.nextInt());
        a2.add(teclado.nextInt());
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < a1.size() ; i++) {
            suma1 += a1.get(i);
        }
        for (int i = 0; i < a2.size(); i++) {
            suma2 += a2.get(i);
        }

        int resultado = suma1 + suma2;
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(resultado);

        System.out.println("a1 = " + suma1);
        System.out.println("a2 = " + suma2);
        System.out.println(suma1 + " + " + suma2 + " = " + (a3));

    }
}
