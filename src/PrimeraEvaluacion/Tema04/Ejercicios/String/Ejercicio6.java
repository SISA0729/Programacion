package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = teclado.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = teclado.nextLine();

        cadena1 = cadena1.replace(" ","");
        cadena2 = cadena2.replace(" ","");

        System.out.println("¿Las cadenas son iguales? " + cadena1.equals(cadena2));
    }
}
