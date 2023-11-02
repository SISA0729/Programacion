package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = teclado.nextLine();
        int li = -1;
        while (li < 0 || li > cadena1.length() - 1){
            System.out.println("Limite inferior");
            li = teclado.nextInt();
            if (li < 0 || li > cadena1.length() - 1){
                System.out.println("No puede ser menor que 0");
            }
        }
        int ls = -1;

        while (ls < 0 || ls > cadena1.length() - 1){
            System.out.println("Limite superior");
            ls = teclado.nextInt();
            if (ls < 0 || ls > cadena1.length() - 1){
                System.out.println("No puede ser menor que 0");
            }
        }

    }
}
