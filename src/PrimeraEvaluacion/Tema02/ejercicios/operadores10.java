package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

public class operadores10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int euros  = teclado.nextInt();

        int billetes500 = euros / 500;
        System.out.println(billetes500+ " biltletes de 500");
        int resto = euros % 500;
        int billeres200 = resto / 200;
        System.out.println(billeres200 + " billetes de 200");
        resto = resto % 200;
        int billetes100 = resto /100;
        System.out.println(billetes100 + " billetes de 100");
        resto = resto % 100;
        int billetes50 = resto /50;
        System.out.println(billetes50 + " billetes de 50");
        resto = resto % 50;
        int billetes20 = resto /20;
        System.out.println(billetes20 + " billetes de 20");
        resto = resto %20;
        int billetes10 = resto /10;
        System.out.println(billetes10 + " billetes de 10");
        resto = resto % 10;
        int billetes5 = resto /5;
        System.out.println(billetes5 + " billetes de 5");
        resto = resto % 5;
        int moneda2 = resto /2;
        System.out.println(moneda2 + " 2 euros");
        resto = resto % 2;
        int moneda1 = resto /1;


    }

}
