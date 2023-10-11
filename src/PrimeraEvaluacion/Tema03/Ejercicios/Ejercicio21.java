package PrimeraEvaluacion.Tema03.Ejercicios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Precio de venta del producto: ");
        double precio = teclado.nextDouble();
        System.out.println("Calidad de productos comprados: ");

        int cantidad = teclado.nextInt();
        int iva = teclado.nextInt();

        double precioiva = precio * cantidad;

    }
}
