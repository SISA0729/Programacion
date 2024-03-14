package lasbatallasdelasalmas;

import java.util.ArrayList;
import java.util.Random;

public class Humano extends Ser implements Espiritual{
    static Random generador = new Random();


    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Angel> angeles;

    public Humano(double fe) {
        this.fe = fe;
        this.angeles = new ArrayList<>();
        this.demonios = new ArrayList<>();
        // TODO AÑADIR ANGEL Y DEMONIO
        añadirAngel();
        añadirDemonio();
    }

    public void añadirAngel(){
        int bondad = generador.nextInt(0,101);
        Angel angel = new Angel(bondad);
        angeles.add(angel);
    }

    public void añadirDemonio(){
        int maldad = generador.nextInt(0,101);
        Demonio demonio = new Demonio(maldad);
        demonios.add(demonio);
    }

    public void rezar(){
        fe++;
        añadirAngel();
    }
    public void pecar(){
        fe--;
        añadirDemonio();
    }

    @Override
    public String toString() {
        String cadena = "Datos del HUmano:\n" +
                "=====================\n" +
                "Fe: " + this.fe +
                "\nEl humano tiene " + angeles.size() + " angeles" +
                "\nEl Humano tiene " + demonios.size() + " demonios" +
                " ";
        return cadena;
    }


    @Override
    public void mostrar() {
        System.out.println(toString());
    }
}
