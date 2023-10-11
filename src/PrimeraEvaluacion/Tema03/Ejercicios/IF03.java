package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class IF03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = teclado.nextInt();

        System.out.print("Ingrese el cuarto número: ");
        int numero4 = teclado.nextInt();

        System.out.print("Ingrese el quinto número: ");
        int numero5 = teclado.nextInt();

        int mayor = numero1;
        int menor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }

        if (numero4 > mayor) {
            mayor = numero4;
        } else if (numero4 < menor) {
            menor = numero4;
        }

        if (numero5 > mayor) {
            mayor = numero5;
        } else if (numero5 < menor) {
            menor = numero5;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
