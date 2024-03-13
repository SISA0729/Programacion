package PrimeraEvaluacion.Tema03.Ejercicios;

import com.sun.source.tree.NewArrayTree;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner TECLADO = new Scanner(System.in);
        int n = TECLADO.nextInt();
        Random generador = new Random();
        int numero = 0;
        for (int i = 0; i < n; i++) {
            numero = generador.nextInt(-10, 11);
            System.out.print(numero + " ");
        }
    }
}
