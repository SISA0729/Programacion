package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero del 1 al 7: ");
        int numero = teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
