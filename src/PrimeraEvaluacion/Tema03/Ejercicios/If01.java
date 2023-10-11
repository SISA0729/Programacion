package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es Par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
