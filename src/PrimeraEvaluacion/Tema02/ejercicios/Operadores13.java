package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        double perimetro = lado * 4;
        System.out.printf("El perimetro del cuadrado es: %.2f", perimetro);

    }
}
