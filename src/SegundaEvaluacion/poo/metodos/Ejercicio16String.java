package SegundaEvaluacion.poo.metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16String {
    public static final Scanner teclado = new Scanner(System.in); // así puedo utilizar este Scanner en toda la clase
    public static void main(String[] args) {
        jugar();
    }

    // programa que pida una lista de palabras (la guardas como una cadena de texto)
    public static String pedirTexto(String introduce) {
        System.out.print(introduce);
        return teclado.nextLine();
    }

    public static void contar(String[] palabras) {
        String palabra = pedirTexto("Introduce una palabra: ");
        int contador = 0;
        for (String s : palabras) {
            if (palabra.equals(s)) {
                contador++;
            }
        }
        System.out.println("La palabra " + palabra + " aparece " + contador + " veces en la lista.");
    }

    public static void modificar(String lista) {
        String palabra1 = pedirTexto("Introduce una palabra de la lista: ");
        String palabra2 = pedirTexto("¿Por qué otra palabra la quieres sustituir?: ");
        lista = lista.replace(palabra1, palabra2);
        System.out.println(lista);
    }

    public static void eliminar(String lista) {
        String palabra = pedirTexto("Introduce una palabra: ");
        lista = lista.replace(palabra, "");
        System.out.println(lista);
    }

    public static void mostrar(String lista) {
        System.out.println(lista);
    }

    public static void jugar() {
        String lista = pedirTexto("Introduce una lista de palabras: ");
        // sacamos las palabras de la lista a un array
        String[] palabras = lista.split(" ");
        System.out.println(Arrays.toString(palabras));

        int opcion;
        do {
            System.out.println("1. Contar\n2. Modificar\n3. Eliminar\n4. Mostrar\n5. Salir");
            System.out.println("Selecciona una opción (1-5)");
            opcion = teclado.nextInt(); teclado.nextLine();
            switch (opcion) {
                case 1:
                    //Contar: pide una palabra, y me dice cuantas veces aparece en la lista
                    // como el método contar no devuelve nada, sino que imprime el resultado, basta con la llamada
                    contar(palabras);
                    break;
                case 2:
                    // Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
                    // como no devuelve nada, simplemente ponemos la llamada
                    modificar(lista);
                    break;
                case 3:
                    //Eliminar: pide una , y la elimina de la lista.
                    eliminar(lista);
                    break;
                case 4:
                    //Mostrar: muestra la lista de palabras
                    mostrar(lista);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 5) ;

    }
}
