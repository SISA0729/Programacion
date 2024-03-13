package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operaciones11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica la Longitud: ");
        double radio = teclado.nextDouble();
        double longitud = 2 * Math.PI * radio;
        System.out.printf("La longitud es: %.2f" , longitud);

    }
}
