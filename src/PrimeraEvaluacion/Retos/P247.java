package PrimeraEvaluacion.Retos;

import java.util.Arrays;
import java.util.Scanner;

public class P247 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n =   teclado.nextInt();
        teclado.nextLine();
        while (n != 0){
            String linea = teclado.nextLine();
            String[] arraylinea = linea.split(" ");
            System.out.println(Arrays.toString(arraylinea));
            n = teclado.nextInt();
            teclado.nextLine();

        }
        teclado.close();
    }
}
