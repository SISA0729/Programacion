package SegundaEvaluacion.poo.clasesyobjetos.aplicaciones;

import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Usuario crearUsuario = new Usuario("ismael","ismael.sisa","1234");

        crearUsuario();
    }

    public static Usuario crearUsuario(){
        System.out.println("datos: ");
        String nombre = teclado.nextLine();
        String password = teclado.nextLine();
        String email= teclado.nextLine();
        Usuario gsdva = new Usuario(nombre,password,email);
        return gsdva;
    }
}
