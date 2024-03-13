package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número a: ");
        int n1 = teclado.nextInt();
        System.out.print("Número b: ");
        int n2 = teclado.nextInt();

        int suma = 0;
        for (int i= n1; i <= n2; i++){
            suma += i;
        }
        System.out.println(suma);
    }
}
