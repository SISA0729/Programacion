package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Eje21UnaForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("a: ");
        int a = teclado.nextInt();
        System.out.print("b: ");
        int b = teclado.nextInt();

        int min;
        int max;
        if (a > b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        int suma = 0;
        for (int i = min; i <= max; i++){
            suma = suma + i;
        }
        System.out.println("La suma de los numero desde " + min + " y " + max + "es: " + suma);
    }
}
