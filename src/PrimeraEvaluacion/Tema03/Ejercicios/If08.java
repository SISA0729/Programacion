package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                System.out.println(ano + " este año es bisiesto");
        } else{
            System.out.println(ano + " este año no es bisiesto");
        }
    }
}
