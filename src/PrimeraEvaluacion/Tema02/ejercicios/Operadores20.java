package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = teclado.nextDouble();
        System.out.print("Ingrese un porcentaje: ");
        double porcentaje = teclado.nextDouble();

        double incremento = numero + (numero * (porcentaje / 100));
        double decremento = numero - (numero * (porcentaje / 100));

        // Mostrar los resultados
        System.out.println("El número incrementado en un " + porcentaje + "% es: " + incremento);
        System.out.println("El número decrementado en un " + porcentaje + "% es: " + decremento);
    }
}
