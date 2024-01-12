package SegundaEvaluacion.poo.metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16ArraysConArrayList {
        static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {

            ArrayList<Integer> numeros = crearArrayList();

            //****** MENU *******
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
                        for (int i = 0; i < 5; i++) {
                            numeros = añadirAlFinal(numeros);
                        }
                        break;
                    case 2:
                        imprimirNumeros(numeros);
                        break;
                    case 3:
                        numero = pedirNumero("Introduce número");
                        indice = pedirNumero("¿En qué indice quieres que lo ponga?");
                        if (indice <= numeros.size() - 1 && indice >= 0) {
                            numeros.add(indice, numero);
                        }
                        break;
                    case 4:
                        System.out.println("Tamaño del array: " + numeros.size());
                        break;
                    case 5:
                        eliminarUltimo(numeros);
                        break;
                    case 6:
                        eliminarNumero(numeros);
                        break;
                    case 7:
                        numero = pedirNumero("Dime el número que quieres contar");
                        int contador = 0;
                        for (Integer elemento : numeros) {
                            if (elemento == numero) {
                                contador++;
                            }
                        }
                        System.out.println("El número " + numero + " aparece " + contador + " veces.");
                        break;
                    case 8:
                        cortarPosiciones(numeros);
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                }

            } while (opcion != 9);

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

        public static int pedirNumero(String texto) {
            System.out.println(texto);
            int numero = teclado.nextInt();
            teclado.nextLine();
            return numero;
        }

        public static ArrayList<Integer> crearArrayList() {
            ArrayList<Integer> numeros = new ArrayList<>();
            return numeros;
        }
        public static void cortarPosiciones(ArrayList<Integer> numeros){
            ArrayList<Integer> posiciones = new ArrayList<>();
            int numero = pedirNumero("Dime el número que quieres buscar: ");
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) == numero) {
                    posiciones.add(i);
                }
            }
            System.out.println("El número " + numero + " aparece en las posiciones " + posiciones);
        }
}



