package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int n1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        int n2 = teclado.nextInt();
        System.out.print("NUmero 3: ");
        int n3 = teclado.nextInt();
        System.out.print("Numero 4: ");
        int n4 = teclado.nextInt();
        System.out.print("Numero 5: ");
        int n5 = teclado.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5){
            System.out.println("El numero " + n1 + " es mayor");
        }
        else if (n2 > n3 && n2 > n4 && n2 > n5 && n2 > n1){
            System.out.println("El numero " + n2 + " es mayor");
        }
        else if (n3 > n4 && n3 > n5 && n3 > n2 && n3 > n1){
            System.out.println("El numero " + n3 + " es mayor");
        }
        else  if (n4 > n5 && n4 > n1 && n4 > n2 && n4 > n1){
            System.out.println("El numero "+  n4 + " es mayor");
        }
        else if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4){
            System.out.println("El numero "+ n5 + " es mayor");
        }



    }
}
