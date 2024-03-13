package SegundaEvaluacion.viajes;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de viaje (Tren/Avion/Bus): ");
        String tipoViaje = scanner.nextLine();
        System.out.println("Donde quiere ir ");
        String destino = scanner.nextLine();
        System.out.println("FECHA INCIO : año mes dia");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        System.out.println("FECHA FIN: año mes dia ");
        int ano1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int dia1 = scanner.nextInt();
        System.out.println("NUMERO PASAJEROS ");
        int numeroP = scanner.nextInt();

        Viaje viaje;
        switch (tipoViaje.toLowerCase()) {
            case "tren":
                viaje = new ViajeTren(destino, LocalDate.of(ano,mes,dia), LocalDate.of(ano1,mes1,dia1),numeroP,50,tipoViaje);
                break;
            case "avion":
                viaje = new ViajeAvion(destino,LocalDate.of(ano,mes,dia), LocalDate.of(ano1,mes1,dia1),numeroP,1500);
                break;
            case "bus":
                viaje = new ViajeBus(destino,LocalDate.of(ano,mes,dia), LocalDate.of(ano1,mes1,dia1),numeroP,25,tipoViaje);
                break;
            default:
                System.out.println("Tipo de viaje no válido");
                return;
        }

        // Cálculo y muestra del precio total del viaje
        double precioTotal = viaje.calcularCosteTotal();
        System.out.println("El precio total del viaje es: $" + precioTotal);

    }
}
