package PrimeraEvaluacion.Tema04.Ejemplos;

public class EjemplosArrays {
    public static void main(String[] args) {
        double alumno1 = 5.5;
        double alumno2 = 8.5;

        //tendria que crear 16 variables
        // utilizar una esctructura que me permita guardar un conjunto de valores DEL MISMO TIPO (doble, strig, int)

        int [] notas = {6,5,8,4,10,3,7,7,5,5}; //declaramos el array notas
        // accedemos con los indeces de los arrays

        System.out.println(notas [0]);
        System.out.println(notas [notas.length - 1]);
        System.out.println(notas.length);

        System.out.println("cambio la primera nota");
        notas [0] = 7;
        System.out.println(notas[notas[0]]);

        //FORMAS DE DECLARAR Y RELLENAR UN ARRAY
        //una es la que de la linea 15: la declara y enumera los datos en orden dentro de {}
        // lo mas habitual es que no sepas los datos antes de declaralo

        int [] numeros = new int[10]; // 10 es el tamaño del array

        //despues puedo itilizar un for para rellenarlo

        // por ejemplo

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();



    }
}
