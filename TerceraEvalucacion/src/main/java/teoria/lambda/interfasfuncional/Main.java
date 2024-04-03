package teoria.lambda.interfasfuncional;

public class Main{
    public static void main(String[] args) {
         HolaMundo holaMundo = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola mundo");
            }
        };
        //una vez que has "rellenado el método de la clase
        //ya tienes un objeto con el que llamarlo
        holaMundo.HolaMundo();

        Impar impar = (n) ->  n % 2 != 0 ;
        System.out.println(impar.esImpar(11));

        ComprobarY comprobarY = (c) ->  c == 'y';
        System.out.println(comprobarY.easy('Y'));

        Sumar sumar = (x, y) -> x + y;
        System.out.printf("%.2f",sumar.sumar(12.1,12.2));

        SumarCuadrados sumarCuadrados = (int a,int b) -> ((int) Math.pow(a,2) + (int) Math.pow(b,2));
        System.out.println(sumarCuadrados.sumarCuadrados(12,1));

        Devuelve42 devuelve42 = () -> 42;
        System.out.println(devuelve42.ddevuelve42());

        DevuelvePi devuelvePi = () -> Math.PI;
        System.out.println(devuelvePi.devuelvePi());

        Imprimir imprimir = s -> System.out.println(s);
        imprimir.imprimirCadena("que bonito lamba");
    }


}
