package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero");
        int contador = 0;
        while (true){
            int numero = teclado.nextInt();
            if (numero == 0){
                break;
            }
            contador++;

        }
        System.out.println("La cantidad es " + contador);
    }
}
