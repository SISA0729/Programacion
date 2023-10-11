package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if ( edad>= 18) {
            System.out.println("Esto se imprime siempre si es true como si es false");
        }
        System.out.println();


        boolean mayorDeEdad = edad >= 18;
        if (mayorDeEdad){
            System.out.println("Solo poniendo la variable mayorDDeEdad, si es true se va a poner");
        }

        if (!mayorDeEdad){
            System.out.println("No eres mayor de edad");
        }
    }
}
