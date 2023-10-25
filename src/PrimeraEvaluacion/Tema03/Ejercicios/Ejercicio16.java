package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("OPeracion a realizar: +, -, /");
        char operacion = teclado.nextLine().charAt(0);
         switch (operacion){
             case '+':
                 System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
             break;
             case '-':
                 System.out.println(n1 + "-" + n2 + " = " + (n1 - n2));
             break;
             case '/':
                 System.out.println(n1 + "/" + n2 + " = " + (n1 / n2));
             break;
             default:
                 System.out.println("OPERACION INCORRECTA");
         }
    }
}
