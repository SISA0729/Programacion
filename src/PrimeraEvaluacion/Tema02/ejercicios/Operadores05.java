package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores05 {
    public static void main(String[] args) {
        System.out.println("----------Ejercicio 5----------");

        Scanner cantidad = new Scanner(System.in);
        System.out.println("Cantidad de minutos: ");
        int valor = cantidad.nextInt();
        int horas = valor / 60;
        int minutos = valor % 60;

        System.out.println("Son " + horas + " hora " + minutos + " minutos");
        System.out.println();
    }
}
