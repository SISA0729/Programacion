package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int a = teclado.nextInt();
        ArrayList<Integer> num = new ArrayList<>(a);
        Random generador = new Random();
        for (int i = 0; i < a; i++) {
            num.add(generador.nextInt(1,11));
        }
        for (int i = 0; i < num.size(); i++) {
            suma += num.get(i);
        }
        System.out.println(num);
        System.out.println("SUMA TOTAL: " + suma);
    }
}
