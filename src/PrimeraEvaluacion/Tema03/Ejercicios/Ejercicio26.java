package PrimeraEvaluacion.Tema03.Ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
        int suma = 0;
        int producto = 1;
        for (int i = 1; i < 31; i++) {
            suma = suma + i;
            producto = producto *i;
        }
        System.out.println("Suma = " + suma );
        System.out.println("Producto = " + producto );
    }
}
