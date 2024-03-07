package PrimeraEvaluacion.Tema02.ejemplos.metodosPrint;

public class Ejemplos {
    public static void main(String[] args) {
        // println --> imprime el contenido dentro de los paréntesis y añade un salto de línea
        System.out.println("Hola, mundo");
        System.out.println("Otra línea");
        System.out.println();
        // print --> imprime el contenido pero no añade un salto, por lo que si tenemos un print a continuación de otro, saldrán ambos en la misma línea
        System.out.print("Hola, ");
        System.out.print("mundo");
        System.out.println();
        System.out.println();
        // printf --> imprime con formato
        /*
        Este método permite formatear y mostrar datos utilizando especificadores de formato,
         como
         %s para cadenas,
         %d para enteros,
         %f para números de punto flotante, etc.
         */

        String nombre = "Juan";
        System.out.printf("Nombre: %s\n", nombre); // en lugar de poner +, ponemos %s dentro de las comillas y, después de la , la variable

        int edad = 25;
        System.out.printf("Edad: %d\n", edad);


        double altura = 1.757575757575757575757;
        System.out.printf("Altura: %.2f \n", altura); // quiero mostrar sólo 2 decimales

        System.out.printf("\n\nLas tres variables en el mismo texto sería: %s, %d, %.2f metros", nombre, edad, altura);

    }
}
