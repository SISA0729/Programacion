package PrimeraEvaluacion.Tema03.masEjercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        boolean primo = true;

        if (numero == 0 || numero == 1){
            System.out.println("No es primo, ni siquiera cuenta");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println("No es primo, divisible entre " + i);
                    primo = false;
                    break;
                }
            }

            if (primo){
                System.out.println("Es primo");

            }
        }
    }
}
