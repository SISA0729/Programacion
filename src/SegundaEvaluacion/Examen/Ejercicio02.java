package SegundaEvaluacion.Examen;

import java.util.Scanner;

public class Ejercicio02 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            int edad = pedirEdad();
            String tipo = devuelveTipo(edad);
            int precio = calcularPrecio(tipo);
            if (edad >= 18) {
                System.out.println("El espectador es " + tipo + ". El precio del ticket: " + precio + "€");
                imprimirTicket(tipo,precio);
                return;
            } else {
                System.out.println("El espectador es " + tipo + ". El precio del ticket: " + precio + "€");
                imprimirTicket(tipo,precio);
                return;
            }

        } while (true);


    }
    public static int pedirEdad (){
        System.out.println("¿Edad?");
        return teclado.nextInt();

    }
    public static String devuelveTipo (int años){
        if (años >= 18){
            return "Adulto";
        }else {
            return "Niño";
        }
    }

    public static int calcularPrecio(String tipo){
        if (tipo == "Adulto"){
            return (int) 4 ;
        }else {
            return (int) 2;
        }
    }

    public static void imprimirTicket(String tipo, int precio){
        if (tipo == "Adulto"){
            if (precio == 4){
                System.out.println(" -------------------------- ");
                System.out.println("|      TICKET ENTRADA      |");
                System.out.println("| Adulto       Precio: 4$  |");
                System.out.println(" -------------------------- ");
            }
        }else if (tipo == "Niño"){
            if (precio == 2){
                System.out.println(" -------------------------- ");
                System.out.println("|      TICKET ENTRADA      |");
                System.out.println("|   Niño       Precio: 2$  |");
                System.out.println(" -------------------------- ");
            }
        }
    }
}
