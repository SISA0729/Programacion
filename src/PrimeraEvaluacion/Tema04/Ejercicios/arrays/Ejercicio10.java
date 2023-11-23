package PrimeraEvaluacion.Tema04.Ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] meses = {31,28,31,30,31,30};
        Scanner teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        do {
             mes = teclado.nextInt();
             if (mes < 1 || mes > 12){
                 System.out.println("Otro..");
             }
        }while (mes < 1 || mes > 12);

        System.out.println(meses[mes]);
    }
}
