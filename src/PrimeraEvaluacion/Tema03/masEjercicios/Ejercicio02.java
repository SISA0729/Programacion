package PrimeraEvaluacion.Tema03.masEjercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorfallo = 0;
        int n = 1;
        int referencia = teclado.nextInt();
        int contador = 0;

        while (n != 0){
            System.out.println("Dime un numero ");
            n = teclado.nextInt();

            if (n < referencia){
                contadorfallo++;
                referencia = n;
            }
            contador++;
        }
        System.out.println("Total de numeros introducidos: " + contador);
        System.out.println("Total de fallos: " + contadorfallo);

    }
}
