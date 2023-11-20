package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fecha = teclado.nextLine();
        String[] arrayfecha = fecha.split("-");
        int dia = Integer.parseInt(arrayfecha[0]);
        int mes = Integer.parseInt(arrayfecha[1]);
        int año = Integer.parseInt(arrayfecha[2]);

        if (año >= 0){
            if (mes >=1 && mes <=12){
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia >= 1 && dia <= 31){
                    System.out.println( dia + " " + mes + " " + año);
                }else {
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 31){
                        System.out.println( dia + " " + mes + " " + año);
                    }else {
                        if (dia >= 1 && dia <= 28){
                            System.out.println( dia + " " + mes + " " + año);
                        }
                    }
                }
            }else{
                System.out.println("ERROR");
            }
        }else{
            System.out.println("ERROR");
        }
    }
}
