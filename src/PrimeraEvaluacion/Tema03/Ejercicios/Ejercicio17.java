package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 -Helado sin topping: ");
        System.out.println("2 -El topping de oreo: ");
        System.out.println("3 -El topping de KitKat: ");
        System.out.println("4 -El topping de brownie: ");
        System.out.println("5 -El topping de lacasitos: ");
        char opcion = teclado.nextLine().charAt(0);
        double helado = 1.90;

        switch (opcion){
            case '1':
                System.out.println(helado);
                break;
            case '2':
                System.out.printf("%.2f",helado + 1);
                break;
            case '3':
                System.out.printf("%.2f",helado + 1.50);
                break;
            case '4':
                System.out.printf("%.2f",helado + 0.75);
                break;
            case '5':
                System.out.printf("%.2f",helado + 0.95);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
