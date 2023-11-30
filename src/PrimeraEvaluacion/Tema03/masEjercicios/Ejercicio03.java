package PrimeraEvaluacion.Tema03.masEjercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = teclado.nextInt();

        if (n <= 0){
            System.out.println("*");
        }else {
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
        }
    }
}
