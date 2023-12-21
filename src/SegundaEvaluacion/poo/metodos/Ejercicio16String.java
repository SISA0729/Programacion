package SegundaEvaluacion.poo.metodos;

import java.util.Scanner;

public class Ejercicio16String {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String lista = pedirTexto("Introduce ");
        System.out.println(lista);
        System.out.println("1.Contar \n2.MOdificar\n3.Eliminar\n4.Mostrar \n5.Salir");
        System.out.println("Seleccione una opcion (1-4)");
        int opcion = teclado.nextInt();
        do {
            switch (opcion){
                case 1:
                    String palabra = pedirTexto("Introduce una palabra: ");
                    int contador = 0;
                    for (int i = 0; i < lista.length() ; i++) {
                        if (palabra.equals(palabra[i])){
                            contador++;
                        }
                    }
                    break;
                case 2:
                    //sda
                    break;
                case 3:
                    //saas
                    break;
                case 4:
                    //asha
                    break;
                case 5:
                    //saas
                    break;
                default:
                    System.out.println("ERROR");
            }
        }while (opcion < 1 || opcion > 5 );
    }

    public static String pedirTexto (String introduce){
        System.out.println(introduce);
        return teclado.nextLine();
    }

}
