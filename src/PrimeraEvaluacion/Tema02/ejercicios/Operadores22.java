package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Precio venta:");
        double precio = teclado.nextDouble();
        System.out.print("Cantidad de productos comprados: ");
        double productos = teclado.nextDouble();
        System.out.print("El porcentaje de IVA: ");
        double porcentaje = teclado.nextDouble();
        double precioproducto = precio * productos;
        double precioporcentaje = precioproducto  * (porcentaje/100);
        double preciototal = precioproducto + precioporcentaje;
        System.out.println("El importe con IVA es: " + preciototal);
        System.out.println();
        System.out.println();
        System.out.println("Pero tienes un descuento de un 15%, asi que el precio final es: ");
        double descuento = preciototal * 15 / 100;
        double finalrebaja= preciototal - descuento;

        System.out.println("Con la rebaja solo pagas: " + finalrebaja);

    }
}
