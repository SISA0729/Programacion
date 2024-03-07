package SegundaEvaluacion.poo.herencia.banco;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona cliente1 = crearCliente();
        System.out.println(cliente1);
        switch (tipoCuenta()){
            case 1:
        }

    }
    static Scanner teclado = new Scanner(System.in);
    public static Persona crearCliente(){
        System.out.println("NOmbre y apellidos y DNI todos ellos separados por un espacio");
        String datosPersonales = teclado.nextLine();
        String[] datos = datosPersonales.split(" ");
        System.out.println(Arrays.toString(datos));
        Persona persona = new Persona(datos[0],datos[1],datos[2],datos[3]);
        return persona;
    }

    public static int tipoCuenta(){
        System.out.println("\nTipo de cuenta:");
        System.out.println("1. Ahorro ");
        System.out.println("2. C.corriente.personal ");
        System.out.println("4  C.corriente.empresa");
        System.out.println("5.  ");
        return teclado.nextInt();
    }
    public int mostrarMenu(){
        int opinio = 0;
        System.out.println("1. Abrir una nueva ventana");
        System.out.println("2. Ver una lista");
        System.out.println("3. Obtener los datos");
        System.out.println("4  Retirar efectivo");
        System.out.println("5. Consultar el saldo");
        System.out.println("6. Salir de la Aplicacion");

        opinio = teclado.nextInt();teclado.nextLine();
        return opinio;


    }
}
