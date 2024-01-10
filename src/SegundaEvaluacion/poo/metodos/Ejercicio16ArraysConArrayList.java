package SegundaEvaluacion.poo.metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16ArraysConArrayList {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int tamaño = sisa("Introduce numero");

        ArrayList<Integer> numeros = crearArrayList();

        int numeroFinal = sisa("Introduce un numero a añadir: ");


        int numero = sisa("Introduce numero");
        int indice = sisa("¿En que indice quieres que lo ponga?");
        if (indice < numeros.size() + 1){
            System.out.println();
        }



    }

    public static int sisa(String texto){
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }
    public static ArrayList<Integer> crearArrayList(){
        ArrayList<Integer> numeros = new ArrayList<>();
        return numeros;
    }
}

