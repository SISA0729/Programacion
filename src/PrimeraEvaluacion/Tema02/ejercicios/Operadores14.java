package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Dime la base del triangulo: ");
        double base = teclado.nextDouble();
        System.out.printf("Dime la altura del triangulo: ");
        double altura = teclado.nextDouble();
        double area = base * altura / 2;
        System.out.println("El area del del triagunlo es :"+ area);
    }
}
