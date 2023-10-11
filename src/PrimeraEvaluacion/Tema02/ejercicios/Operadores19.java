package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores19 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Nota del módulo: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Nota del módulo: ");
        double nota2 = teclado.nextDouble();
        double sumaNotas = nota1 + nota2;

        double notaFinal = sumaNotas / 2;
        double fina = Math.round(notaFinal);

        System.out.println("La nota final del curso es: " + fina);


    }
}
