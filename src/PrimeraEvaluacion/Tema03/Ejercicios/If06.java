package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("número:");
        int num1 = scanner.nextInt();

        System.out.println("número:");
        int num2 = scanner.nextInt();

        System.out.println("número:");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
            if (num2 <= num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);
            if (num1 <= num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            System.out.println(num3);
            if (num1 <= num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }
}
