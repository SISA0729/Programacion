package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la coordenada primer punto (x1): ");
        double x1 = teclado.nextDouble();
        System.out.print("Ingresa la coordenada primer punto (y1): ");
        double y1 = teclado.nextDouble();
        System.out.print("Ingresa la coordenada segundo punto (x2): ");
        double x2 = teclado.nextDouble();
        System.out.print("Ingresa la coordenada segundo punto (y2): ");
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("La distancia entre los dos puntos es: %.2f", distancia);

    }
}
