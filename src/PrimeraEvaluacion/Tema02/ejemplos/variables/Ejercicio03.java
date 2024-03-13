package PrimeraEvaluacion.Tema02.ejemplos.variables;

public class Ejercicio03 {
        // sirve para comentar, de momento todas las clases deben llevar un metodo main new

    public static void main(String[] args) {
        //una variable es una palabra que guarda un valor
        //tipos de variables:
        //- numéricas:
        //      -enteros
        // según el tamaño que vayan a ocupar en memoria: byte (8 bits), short (2 bytes), int (4bytes), long (8bytes)
        // se suelen utilzar: int, y, si no "cabe" , long
        int año = 2023;
        System.out.println("Empiezo DAM en " + año);
        // si quiero cambiar el valor ed la variable año:
        año = año + 2;
        System.out.println("Me titulare como Tecnico SUperior en " + año);

        //      -en coma flotante (con decimales)
        // tenemos float (32 bits) - mejor no utilizarlo - y double (64bits)
        double sueldo = 20800;
        System.out.println("El sueldo de un desarrollador junior es " + sueldo + "$");
        double porcentajeSubida = 0.0452; //4.52%
        double subidaAnual = sueldo * porcentajeSubida;
        System.out.println("En un año me subiran " + subidaAnual + "$");

        // otro tipo de variable: String = cadena de caracteres, o texto
        String nombre = "ISMAEL";
        String apellido1 = "SISA";

        System.out.println("Mi nombre es " + nombre + " " + apellido1);


    }
}
