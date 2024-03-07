package SegundaEvaluacion.poo.metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16ArraysConArrayList {
    // quiero un Scanner que sea visible en todos los métodos de esta clase
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Crear un programa que cree un array de números enteros (tamaño introducido por teclado),
        // muestre el siguiente menú y realice lo que en las opciones se indica:
        // otra forma: int tamaño = Integer.parseInt(teclado.nextline());
        //int tamaño = pedirNumero("Introduce el tamaño"); // me da igual porque va a ser un arraylis


        // crear un arraylist de números enteros
        ArrayList<Integer> numeros = crearArrayList();

        //****** MENU *******
        // variables que voy a utilizar en el switch
        int opcion = 0;
        int indice = 0;
        int numero = 0;
        do {
            System.out.println("1. Añadir al final.");
            System.out.println("2. Mostrar números.");
            System.out.println("3. Añadir número en una posición.");
            System.out.println("4. Longitud del array.");
            System.out.println("5. Eliminar el último número.");
            System.out.println("6. Eliminar un número.");
            System.out.println("7. Contar números.");
            System.out.println("8. Posiciones de un número.");
            System.out.println("9. Salir.");
            System.out.println("============================");
            opcion = pedirNumero("Selecciona una opción (1 - 9): ");
            System.out.println(opcion);
            switch (opcion) {
                case 1:
                    //Añadir número al final: pide un número y lo añade al final del array.
                    // para tener un poco más de juego, metemos 5 números en el arraylist
                    //for (int i = 0; i < 5; i++) {
                    numeros = añadirAlFinal(numeros);
                    //}
                    break;
                case 2:
                    // imprimimos el arraylist
                    imprimirNumeros(numeros);
                    break;
                case 3:
                    //Añadir número en una posición: pide un número y una posición, y si la posición existe en el array lo añade en esa posición (la posición se pide a partir de 1).
                    añadirEnPosicion(numeros);
                    break;
                case 4:
                    //Longitud del array: muestra el tamaño del array.
                    mostrarTamaño(numeros);
                    break;
                case 5:
                    //Eliminar el último número: muestra el último número del array y lo borra.
                    eliminarUltimo(numeros);
                    break;
                case 6:
                    //Eliminar un número: pide una posición, y si la posición existe en el array borra el elemento que contiene (lo reemplaza con un 0).
                    eliminarNumero(numeros);
                    break;
                case 7:
                    //Contar números: pide un número y te dice cuántas veces aparece en el array.
                    contarNumeros(numeros);
                    break;
                case 8:
                    //Posiciones de un número: pide un número y te dice en que posiciones está.
                    contarPosiciones(numeros);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 9);

    }

    public static void contarPosiciones(ArrayList<Integer> numeros) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        int numero = pedirNumero("Dime el número que quieres buscar: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero) {
                posiciones.add(i);
            }
        }
        System.out.println("El número " + numero + " aparece en las posiciones " + posiciones);
    }
    public static void contarNumeros(ArrayList<Integer> numeros) {
        int numero = pedirNumero("Dime el número que quieres contar");
        int contador = 0;
        for (Integer elemento: numeros) {
            if (elemento == numero) {
                contador++;
            }
        }
        System.out.println("El número " + numero + " aparece " + contador + " veces.");
    }
    public static void mostrarTamaño(ArrayList<Integer> numeros) {
        System.out.println("Tamaño del array: " + numeros.size());
    }

    public static void añadirEnPosicion(ArrayList<Integer> numeros ){
        int numero = pedirNumero("Introduce número");
        int indice = pedirNumero("¿En qué indice quieres que lo ponga?");
        if(indice <= numeros.size() - 1 && indice >= 0) {
            numeros.add(indice,numero);
        }
    }

    public static void eliminarNumero(ArrayList<Integer> numeros) {
        int indice = pedirNumero("Dime el índice del elemento que quieres borrar: ");
        if (indice <= numeros.size() - 1) {
            numeros.remove(indice);
        }
        System.out.println(numeros);
    }

    public static void eliminarUltimo(ArrayList<Integer> numeros) {
        System.out.println("Se va a borrar el elemento: " + numeros.get(numeros.size() - 1));
        numeros.remove(numeros.size() - 1);
        System.out.println(numeros);
    }

    public static void imprimirNumeros(ArrayList<Integer> numeros) {
        System.out.println(numeros);
    }
    public static ArrayList<Integer> añadirAlFinal(ArrayList<Integer> numeros) {
        int numeroFinal = pedirNumero("Introduce el número a añadir: ");
        numeros.add(numeroFinal);
        return numeros; // devolvemos el arraylist modificado
    }

    // método que pida el tamaño
    public static int pedirNumero(String texto) {
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }

    public static ArrayList<Integer> crearArrayList() {
        ArrayList<Integer> numeros = new ArrayList<>();
        return numeros;
    }
}



