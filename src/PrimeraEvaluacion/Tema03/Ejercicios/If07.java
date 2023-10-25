package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tazas = teclado.nextInt();
        boolean finde = teclado.nextBoolean();
        boolean exito = false;
        if (tazas >= 15 && tazas <= 25) {
                exito = true;
                System.out.println(exito);
        }
        else if (tazas >= 10 && tazas <= 20){
                exito = true;
                System.out.println(exito);
        }
    }
}


