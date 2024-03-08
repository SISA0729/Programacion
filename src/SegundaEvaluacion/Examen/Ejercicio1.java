package SegundaEvaluacion.examen;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String johan = "";
        do {
            System.out.println("Introduce un codigo: ");
            String sisa = teclado.nextLine();
            System.out.println("CODIGO SWIFT " + sisa + ":");
            System.out.println("======================");

            comprobarNumero(sisa);
            monstrarDatos(sisa);

            System.out.println("¿Quienes salir? (S/n)");
            johan = teclado.nextLine();

            if (johan.equals("S")){
                return;
            }
        }while (true);
    }

    public static boolean comprobarNumero(String sisa){

        if (sisa.length() == 8 || sisa.length() == 11){
            return true;
        }else {
            System.out.println("El numero de caracteres introducidos " + "("+sisa.length()+")" + " no es correcto.");
            System.out.println("Un codigo SWFT tiene 8 u 11 caracteres");
            return false;
        }
    }

    public static void monstrarDatos(String sisa2){
        String sisa3 = sisa2.substring(4,6);
        System.out.println("Pais:" + sisa3);
        String sisa4 = sisa2.substring(6,8);
        if (sisa3.equals("ES")&& sisa4.equals("MM")){
            System.out.println("Localidad: Madrid");
        } else if (sisa3.equals("RU") && sisa4.equals("MM")) {
            System.out.println("Localidad: Moscu");
        }

    }
}
