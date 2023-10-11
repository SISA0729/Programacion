package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una: ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        int casa = teclado.nextInt();
        int casa2 =teclado.nextInt();

        switch (casa){
            case 1:
                System.out.println("Valentia");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("ERROR");
        }
        switch (casa2){
            case 1:
                System.out.println("Valentia");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
