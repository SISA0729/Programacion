package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class EjemplosElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad?");
        int edad = teclado.nextInt();
        if (edad <= 15) {
            System.out.println("no puedes trabajar");
        }
       else if (edad >= 16 && edad <= 64) {
            System.out.println("Estudiar o cotizar");
        }
       else {
            System.out.println("a descansar");
        }
    }
}
