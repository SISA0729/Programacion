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
            //System.out.println(Arrays.toString(arraylinea));
            int[] numeros = new int[arraylinea.length];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(arraylinea[i]);
            }
            boolean SalimosdeLaCrisis = true;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] >= numeros[i + 1]){
                    SalimosdeLaCrisis = false;
                    break;
                }
            }
            if (SalimosdeLaCrisis){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }

        }
        teclado.close();
    }
}
