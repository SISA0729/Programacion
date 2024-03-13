package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercico29 {
    public static void main(String[] args) {
        Scanner teclaado = new Scanner(System.in);
        System.out.print("Numero Base: ");
        double base = teclaado.nextDouble();
        System.out.print("Numero Exponente: ");
        int exponente = teclaado.nextInt();

        double resultado = 1.0;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);


    }
}

