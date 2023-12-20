package SegundaEvaluacion.poo.metodos;

import java.util.Scanner;

public class EjemplosMetodos {
    public static void main(String[] args) {
        double n1 = num();
        double n2 = num();
        System.out.println(menu());
        System.out.println(realizarOperacion(1,n1,n2)

    }

    public static double num(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        return teclado.nextDouble();
    }


    //SUMA
    public static double suma(double a, double b){
        return a + b;
    }

    //RESTA
    public static double resta(double a, double b){
        return a - b;
    }

    //MULTIPLICACION
    public static double multi(double a, double b){
        return a * b;
    }

    //DIVISION
    public static double divi(double a, double b){
        return a / b;
    }
    //MENU CON LAS 4 OPCIONES Y DEVUELVA LA OPCION ELEGIDA
    public  static  int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        int opcion = teclado.nextInt();

        return opcion;

    }
    public static void realizarOperacion(int opcion, double n1,double n2){
        double resultado = 0;
        switch (opcion){
            case 1:
                resultado = suma(n1,n2);
            break;
            case 2:
                resultado = resta(n1,n2);
                break;
            case 3:
                resultado = multi(n1,n2);
                break;
            case 4:
                resultado = divi(n1,n2);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        return;
    }

}
