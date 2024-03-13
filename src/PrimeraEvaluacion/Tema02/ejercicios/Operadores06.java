package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores06 {
    public static void main(String[] args) {
        System.out.println("----------Ejercicio 6----------");
        Scanner texto = new Scanner(System.in);
        System.out.println("Cantidad en segundos: ");
        int dato = texto.nextInt();
        int horas2 = dato / 3600;
        int minutos2 = dato % 3600 / 60;
        int segundos = dato % 60 ;

        System.out.println("Son " + horas2 + " hora " + minutos2 + " minutos " + segundos + " segundos ");

    }
}
