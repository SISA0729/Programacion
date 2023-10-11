package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Vamos a ver como se introducen los datos por teclado

        Scanner teclado = new Scanner(System.in); // esta linea la ponemos en todas las clases en que queramos introducir datos por teclados
        System.out.println("Introduce tu nombre: ");
        // escribimos el nombre con teclado y lo guardamos en una variable
        String nombre = teclado.nextLine();
        System.out.println("Hola: " + nombre );

    }

}
