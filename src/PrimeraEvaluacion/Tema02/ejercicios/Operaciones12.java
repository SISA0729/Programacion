package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operaciones12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area de la circunferencia es: %.2f", area);
    }
}
