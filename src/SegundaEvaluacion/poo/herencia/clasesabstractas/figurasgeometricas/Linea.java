package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

public class Linea {
    final int dimensiones = 1;
    Punto puntoinicio;
    Punto puntofinal;

    public Linea(Punto puntoinicio, Punto puntofinal) {
        this.puntoinicio = puntoinicio;
        this.puntofinal = puntofinal;
    }

    public double calcularLongitud(){
        return  Math.sqrt(Math.pow(puntofinal.x - puntoinicio.x, 2) + Math.pow
                (puntofinal.y - puntoinicio.y, 2));
    }

    @Override
    public String toString() {
        return puntoinicio + " , "  + puntofinal + " = " + this.calcularLongitud();
    }

    public void dibujarLInea(){
        int longitud = (int) this.calcularLongitud();
        for (int i = 0; i < longitud; i++) {
            System.out.print("_");
        }
        System.out.println();

    }
}
