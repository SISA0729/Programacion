package teoria.teoriainterfacesfuncionales;

public class Main {
    public static void main(String[] args) {
        // voy a intentar instanciar la interfaz funcional HolaMundo
        // me crea una clase anónima (lo que hay entre las {}) para que implemente el método
       /* HolaMundo hm = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola, mundo");
            }
        };*/

        HolaMundo hm = () -> System.out.println("Hola, mundo");


        // una vez que has "rellenado" el método de la clase anónima, ya tienes un objeto con el que llamarlo
        hm.HolaMundo();
        //prueba

        // de los métodos que tenemos debajo vamos a convertirlos en interfaz funcional + lambda


        // 1. Comprueba si el parámetro recibido es un número impar.
        Impar impar = n -> n % 2 != 0;
        System.out.println(impar.esImpar(15));

        //Comprueba si el parámetro es la letra ‘y’ (minúscula).
        ComprobarY comprobar = c ->  c == 'y';
        System.out.println(comprobar.esy('Y'));

        //Devuelve la suma de dos números.
        Sumar suma = (x, y) -> x + y;
        System.out.printf("%.2f", suma.sumar(12.1, 12.2));

        // Devuelve la suma de los cuadrados de dos números.
        SumaCuadrados sc = (a, b) -> ((int) Math.pow(a, 2) + (int) Math.pow(b, 2));

        //Devuelve el número 42.
        Devuelve42 d42 = () -> 42;
        System.out.println("\n" + d42.devolver42());

        //Devuelve el número pi.
        DevolverPI dPI = () -> Math.PI;

        //Imprime una cadena de texto.
        Imprimir imprimir = s -> System.out.println(s);
        imprimir.imprimirCadena("qué bonitos los lambda");
    }



    //Comprueba si el parámetro recibido es un número impar.
    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }


    //Comprueba si el parámetro es la letra ‘y’ (minúscula).
    public static boolean esy(Character c) {
        return c == 'y';
    }


    //Devuelve la suma de dos números.
    public static double sumar(double x, double y) {
        return x + y;
    }


    //Devuelve la suma de los cuadrados de dos números.
    public static int sumarCuadrados(int a, int b) {
        return a * a + b * b;
    }


    //Devuelve el número 42.
    public static int devolver42() {
        return 42;
    }


    //Devuelve el número pi.
    public static double devolverPI() {
        return Math.PI;
    }


    //Imprime una cadena de texto.
    public static void imprimirCadena(String s) {
        System.out.println(s);
    }


    //Imprime “Hola, mundo”.
    public static void imprimirHolaMundo() {
        System.out.println("Hola, mundo.");
    }

}
