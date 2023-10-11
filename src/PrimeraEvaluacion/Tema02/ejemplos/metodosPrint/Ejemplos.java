package PrimeraEvaluacion.Tema02.ejemplos.metodosPrint;

public class Ejemplos {
    public static void main(String[] args) {
        //println --> imprime el contenido dentro de oos paréntesis y añade un salto de linea
        System.out.println("Hola, mundo");
        System.out.println("Otra línea");
        System.out.println();
        //print --> imprime el contenido pero no añade un salto, por lo que si tenemos un print s continuacion de otro, saldran ambos en la ultima linea
        System.out.print("Hola, ");
        System.out.print("mundo");
        System.out.println();
        System.out.println();
        //printf --> imprime con formato
        /*
        Este método permite formatear y mostrar datos utilizando especificadores de formato, como
        %s para cadenas,
        %d para enteros,
        %f para números de punto flotante,
         */

        String nombre = "Juan";
        System.out.printf("Nombre: %s\n", nombre); // en lugar de poner +, ponemos %s dentro de las comillas y despues de la , la variable


        int edad = 25;
        System.out.printf("Edad: %d\n", edad);
        double altura = 1.75;
        System.out.printf("altura %.2f\n", altura);

        System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f metros", nombre, edad, altura);

    }
}
