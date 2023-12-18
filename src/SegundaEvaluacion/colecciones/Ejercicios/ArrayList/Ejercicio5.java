package SegundaEvaluacion.colecciones.Ejercicios.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 10; i++) {
            num.add(generador.nextInt(1,11));
        }
        System.out.println(num);

        Collections.sort(num);
        System.out.println(num);

        Collections.reverse(num);
        System.out.println(num);
    }
}
