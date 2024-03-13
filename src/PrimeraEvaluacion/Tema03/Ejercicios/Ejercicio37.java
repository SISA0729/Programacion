package PrimeraEvaluacion.Tema03.Ejercicios;

public class Ejercicio37 {
    public static void main(String[] args) {
        int contador = 0;
        int i = 0;

        while (contador <50){
            i++;
            if (i % 5 == 0){
                contador++;
                System.out.print(i + "\t");
                if (contador % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
