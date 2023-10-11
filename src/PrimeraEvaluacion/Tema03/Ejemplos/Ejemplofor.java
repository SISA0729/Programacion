package PrimeraEvaluacion.Tema03.Ejemplos;

public class Ejemplofor {
    public static void main(String[] args) {
        for (int i = 0; // aqui inicializamos el valor del bicle
             i < 5; //si es true seguimos en bucle
             i++
        ){
            System.out.println("Hola");
        }

        System.out.print("Cuando finaliza el programa:");
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");

    }
        System.out.println();
        for (int i = 0; i <= 20; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //Los numero de la inicializacio, etc. pueden ser variables
        int inicio = 0;
        int fin = 10;
        for (int i = inicio; i < fin; i++){
            System.out.print(i + " ");
        }
        //Unas de las aplicaciones de los bucles for es el ir acumulando, sumando, valores que se van generando en cada iteracion
        // Ejemplo: wueremos sumar todos los numeros que van del 1 al 10. 0 sea,tengo que sumar 1 + 2 + 3 + .... + 10
        //El 1, el 2, el 3.... son los valores de i en cada iteracion
        // solo necesito añador una variable que los vaya acumulando
        int suma = 0;
        for (int i = 0; i < 11; i++){
        suma = suma + i;
            System.out.println("sumamos " + i + ": " + suma);}
}}
