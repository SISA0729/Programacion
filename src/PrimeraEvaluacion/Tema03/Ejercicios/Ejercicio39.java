package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu:\n1. A\n2. B\n3. C\n4. D\n5. Salir");
        int opcion = teclado.nextInt();

        while (opcion != 5){
            System.out.println("Menu:\n1. A\n2. B\n3. C\n4. D\n5. Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println(" ");
            }
        }



    }
}
