package lasbatallasdelasalmas;

import java.util.ArrayList;

public class CampoDeBatalla {
    public static void main(String[] args) {
        Humano humano = new Humano(50);
        System.out.println();
        luchar(humano);

        humano.rezar();
        humano.rezar();
        humano.rezar();
        humano.pecar();
        humano.rezar();
        humano.pecar();
        humano.rezar();
        humano.pecar();
        humano.mostrar();
    }
    public static void luchar(Humano h){
        ArrayList<Angel> angeles = h.angeles;
        ArrayList<Demonio> demonios = h.demonios;

        int sumaBondad = 0;
        for (int i = 0; i < angeles.size(); i++) {
            sumaBondad = sumaBondad + angeles.get(i).bondad;
        }
        int sumaMaldaad = 0;

        for (Demonio demonio: demonios){
            sumaMaldaad += demonio.getMaldad();
        }
        System.out.println("Combate entre angeles y demonios: ");
        System.out.println("================================= ");
        System.out.println(sumaBondad);
        System.out.println(sumaMaldaad);


        if (sumaBondad > sumaMaldaad){
            h.rezar();
        }else if (sumaBondad < sumaMaldaad){
            h.pecar();
        }
        System.out.println();

    }
}
