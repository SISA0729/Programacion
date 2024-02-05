package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.util.ArrayList;
import java.util.Arrays;

public class Programador extends Empleado{
    protected String[] lenguajes;

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
}
