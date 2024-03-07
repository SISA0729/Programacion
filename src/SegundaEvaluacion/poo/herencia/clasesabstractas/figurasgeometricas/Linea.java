package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

public class Linea {
    final int DIMENSIONES = 1;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public double calcularLongitud() {
        return Math.sqrt(Math.pow(puntoFin.x - puntoInicio.x, 2)
                + Math.pow(puntoFin.y - puntoInicio.y, 2));
    }

    @Override
    public String toString() {
        return puntoInicio + " - " + puntoFin + " longitud:" +this.calcularLongitud();
    }

    public void dibujarLinea() {
        int longitud = (int) this.calcularLongitud();
        for (int i = 0; i < longitud; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

}
