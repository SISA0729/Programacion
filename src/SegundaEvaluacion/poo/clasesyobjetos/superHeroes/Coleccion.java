package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura>  listFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }



}
