package PrimeraEvaluacion.Tema03.Ejercicios;

public class Ejercicio36 {
    public static void main(String[] args) {
        int i = 1;
        int contador = 0;
        while (i <= 20){
            if (i % 5 == 0){
                System.out.println(i);
                contador++;
            }
            i++;
        }
    }
}
