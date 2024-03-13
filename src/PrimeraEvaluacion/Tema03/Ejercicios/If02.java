package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Escribe otro numero: ");
        int n2 = teclado.nextInt();

        if (n1 > n2){
            System.out.println("El primero numero es mayor");
        }
        else {
            System.out.println("El segundo numero es mayor");
        }
    }
}
