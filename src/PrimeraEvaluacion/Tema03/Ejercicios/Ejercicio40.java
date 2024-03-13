package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        int bingo = generador.nextInt(1,101);
        System.out.println("Introduce numeros: ");
        int intento = teclado.nextInt();

        while (intento != 0 && intento != bingo){
            if (intento < 1 || intento > 100){
                System.out.println("Mal te has salido");
            } else if (intento < bingo){
                System.out.println(intento + " es menos que el numero");
            } else if (intento > bingo) {
                System.out.println(intento + " es mayor que el numero");
            } else {
                System.out.println("BINGO");
            }

            System.out.println("Intenta de nuevo");
            intento = teclado.nextInt();
        }


    }




}
