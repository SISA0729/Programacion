package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdce un numero: ");
        int n =teclado.nextInt();
        int suma = 0;
        int multi = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Tabla del "+ i + ": \t");
            suma =+ i;
            for (int j = 0; j <= 10; j++) {
                multi = i * j;
                System.out.print(multi + "\t");
            }
            System.out.println();
        }

    }

}
