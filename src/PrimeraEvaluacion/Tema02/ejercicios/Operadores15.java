package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la temperatura: ");
        double centrigrados = teclado.nextDouble();
        double reamur = centrigrados * 0.8;
        double fahenheit = (centrigrados * 9/5) + 32;
        double Kelvin = centrigrados + 273;

        System.out.printf("Reamur: %.2f", reamur);
        System.out.println();
        System.out.printf("Fahernheit: %.2f", fahenheit);
        System.out.println();
        System.out.printf("Kelvin: %.2f", Kelvin);
    }
}
