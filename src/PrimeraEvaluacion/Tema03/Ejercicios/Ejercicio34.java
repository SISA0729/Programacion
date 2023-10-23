package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int contador = 0;
        double suma = 0;

        while (numero != 0){
            suma = suma + numero;

            contador++;
            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();
        }
        double media = suma / contador;
        System.out.printf("Media = %.2f", media);

    }
}
