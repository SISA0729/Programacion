package SegundaEvaluacion.viajes2;

import java.util.Scanner;

public class Viaje {
    private String destino;
    private int duracion;
    private double costo;
    private double descuento;

    public Viaje(String destino, int duracion, double costo, double descuento) {
        this.destino = destino;
        this.duracion = duracion;
        this.costo = costo;
        this.descuento = descuento;
    }

    public double calcularCostoTotal() {
        double costoTotal = costo - (costo * (descuento / 100));
        return costoTotal;
    }

    public void mostrarInformacion() {
        System.out.println("Destino: " + destino);
        System.out.println("Duración: " + duracion + " días");
        System.out.println("Costo total: $" + calcularCostoTotal());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el destino del Viaje 1:");
        String destino1 = scanner.nextLine();

        System.out.println("Ingrese la duración del Viaje 1 en días:");
        int duracion1 = scanner.nextInt();

        System.out.println("Ingrese el costo del Viaje 1:");
        double costo1 = scanner.nextDouble();

        System.out.println("Ingrese el descuento del Viaje 1:");
        double descuento1 = scanner.nextDouble();

        System.out.println("Ingrese el destino del Viaje 2:");
        scanner.nextLine(); // Limpiar el buffer del scanner
        String destino2 = scanner.nextLine();

        System.out.println("Ingrese la duración del Viaje 2 en días:");
        int duracion2 = scanner.nextInt();

        System.out.println("Ingrese el costo del Viaje 2:");
        double costo2 = scanner.nextDouble();

        System.out.println("Ingrese el descuento del Viaje 2:");
        double descuento2 = scanner.nextDouble();

        Viaje viaje1 = new Viaje(destino1, duracion1, costo1, descuento1);
        Viaje viaje2 = new Viaje(destino2, duracion2, costo2, descuento2);

        System.out.println("Información del Viaje 1:");
        viaje1.mostrarInformacion();

        System.out.println("\nInformación del Viaje 2:");
        viaje2.mostrarInformacion();
    }
}
