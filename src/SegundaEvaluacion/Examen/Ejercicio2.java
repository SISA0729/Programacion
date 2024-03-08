package SegundaEvaluacion.examen;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int edad = pedirEdad();
        String tipo = devolverEdad(edad);
        int precio = calcularPrecio(tipo);

        System.out.println(tipo);
        System.out.println(precio + "");

        imprimirTicket(tipo,precio);

    }
    public static int pedirEdad(){
        System.out.println("¿Edad?");
        return teclado.nextInt();
    }
    public static String devolverEdad(int edad){
        if (edad >= 18){
            return (String) "Adulto";
        }else {
            return (String) "Niño";
        }
    }
    public static int calcularPrecio(String tipo) {
        if (tipo.equals("Adulto")) {
            return 4;
        } else {
            return 2;
        }
    }

    public static void imprimirTicket(String tipo, int precio){
        System.out.println("----------------------------");
        System.out.println("|      TICKET DE ENTRADA    |");
        System.out.println("| " + tipo + "\t\tPrecio: " + precio + " € |");
        System.out.println("----------------------------");
    }
}
