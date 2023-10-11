package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Operadores23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el sueldo base del vendedor
        System.out.print("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();
        System.out.print("Ingrese las venta realizadas: ");
        double venta1 = scanner.nextDouble();


        double comisionTotal = venta1 * 0.10;
        double totalCobrado = sueldoBase + comisionTotal;

        System.out.printf("Comisión total: %.2f",comisionTotal);
        System.out.println();
        System.out.printf("Total cobrado por el vendedor: %.2f", totalCobrado);

    }
}
