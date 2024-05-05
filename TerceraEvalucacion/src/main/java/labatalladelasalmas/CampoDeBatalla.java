package labatalladelasalmas;

import java.util.ArrayList;

public class CampoDeBatalla {
    // Contiene el método main, donde se
    //crean los humanos y se realizan llamadas a métodos, y un
    //o Método luchar(Humano h); se le pasa un humano por parámetro.
    //Calcula la suma de la bondad de todos sus ángeles y la suma de la
    //maldad de todos sus demonios, y las compara. Si hay más bondad que
    //maldad, el humano reza. Si hay más maldad que bondad, el humano
    //peca. Cada vez que un humano lucha hay que mostrar lo que sucede.
    //Antes de terminar, se muestran los datos del humano tras el combate. A
    //continuación tienes un ejemplo de lo que muestra este método.

    public static void main(String[] args) {
        // /crean los humanos y se realizan llamadas a métodos,
        Humano humano1 = new Humano(50);
        humano1.mostrar();
        System.out.println();

        luchar(humano1);


        humano1.rezar();
        humano1.rezar();
        humano1.rezar();
        humano1.pecar();
        humano1.pecar();
        humano1.pecar();
        humano1.rezar();
        humano1.rezar();


        humano1.mostrar();
    }

    // o Método luchar(Humano h); se le pasa un humano por parámetro.
    //    //Calcula la suma de la bondad de todos sus ángeles y la suma de la
    //    //maldad de todos sus demonios, y las compara. Si hay más bondad que
    //    //maldad, el humano reza. Si hay más maldad que bondad, el humano
    //    //peca.
    public static void  luchar(Humano h) {
        ArrayList<Angel> angeles = h.angeles;
        ArrayList<Demonio> demonios = h.demonios;
        // sumar la bondad de los ángeles
        int sumaBondad = 0;
        for (int i = 0; i < angeles.size(); i++) {
            sumaBondad = sumaBondad + angeles.get(i).bondad;
        }
        // sumar la maldad de todos los demonios
        int sumaMaldad = 0;
        for (Demonio demonio: demonios) {
            sumaMaldad += demonio.getMaldad();
        }
        System.out.println("Combate entre ángeles y demonios:");
        System.out.println("=================================");
        System.out.println("Bondad de los ángeles: " + sumaBondad);
        System.out.println("Maldad de los demonios: " + sumaMaldad);

        // ahora las comparamos
        if (sumaBondad > sumaMaldad) {
            System.out.println(sumaBondad + " > " + sumaMaldad + "\n El humano reza, por lo que tiene un ángel más y la fe del humano aumenta");
            h.rezar();
        } else if (sumaBondad < sumaMaldad){
            System.out.println(sumaMaldad + " > " + sumaBondad + "\n El humano peca por lo que tiene un demonio más y la fe del humano disminuye");
            h.pecar();
        }
        System.out.println();
        //  Cada vez que un humano lucha hay que mostrar lo que sucede.
    }
}
