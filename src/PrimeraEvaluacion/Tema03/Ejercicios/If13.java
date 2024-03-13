package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Escribe una direccion: \n1 - arriba\n2 - abajo\n3 - izquierda\n4 - derecha\n0 - no mover");
        int numero = teclado.nextInt();
        if (numero == 1 ){
            System.out.println("arriba");
        }
        else if (numero == 2 ){
            System.out.println("abajo");
        } else if (numero == 3) {
            System.out.println("izquierda");
        } else if (numero == 4) {
            System.out.println("derecha");
        } else if (numero == 0) {
            System.out.println("no mover");
        }
        else {
            System.out.println("ERROR");
        }

    }
}
