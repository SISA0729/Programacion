package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class Basicos01 {

    public static void main(String[] args) {
        System.out.println("----------Ejercicio 1----------");

        System.out.println("!Hola¡");

        System.out.println("----------Ejercicio 2----------");

        System.out.println("Primero");
        System.out.println("Segundo");
        System.out.println("Tercero");
        System.out.println();
        System.out.println("primera\nsegunda\ntercera");

        System.out.println("----------Ejercicio 3----------");

        System.out.println("********");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");


        System.out.println("----------Ejercicio 4----------");

        String i0 = "0";
        String i1 = "1";
        String i2 = "2";
        String i3 = "3";
        String i4 = "4";
        String i5 = "5";
        String i6 = "6";
        String i7 = "7";
        String i8 = "8";
        String i9 = "9";

        System.out.println(i0);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        /*
        System.out.println("1\n2\n");
         */

        System.out.println("----------Ejercicio 5----------");

        System.out.println( i9 + " " + i8 + " " + i7 + " " + i6 + " " + i5 + " " + i4 + " " + i3 + " " + i2 + " " + i1 + " " + i0 );

        System.out.println("----------Ejercicio 6----------");

        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");

        System.out.println("----------Ejercicio 7----------");

        System.out.println("----ENTRADA----");

        Scanner dato = new Scanner(System.in);
        String dato1 = dato.nextLine();
        String dato2 = dato.nextLine();
        String dato3 = dato.nextLine();

        System.out.println("----SALIDA----");

        System.out.println(dato3);
        System.out.println(dato2);
        System.out.println(dato1);

        System.out.println("----------Ejercicio 8----------");

        Scanner texto = new Scanner(System.in);
        System.out.println("Introduce los datos del chef: ");

        System.out.println("Nombre: ");String nombre = texto.nextLine();
        System.out.println("Edad: ");int edad = texto.nextInt();
        texto.nextLine();
        System.out.println("Años de experiencia: ");int años = texto.nextInt();
        texto.nextLine();
        System.out.println("Preferencias de cocina: ");String preferencias =texto.nextLine();

        System.out.println("El formulario es de " + nombre + ", de " + edad + " años y " + años + " de experiencia, está completo.\n" +
                "Nos comunicaremos con usted si necesitamos alguien que cocine comida " + preferencias);

        System.out.println("----------Ejercicio 9---------");

        int valor = 123456;
        System.out.println(valor);
    }

}
