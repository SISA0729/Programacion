package SegundaEvaluacion.Examen.Ejercicio03;

public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String matricula) {
        super(matricula);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "El vehiculo con la matricula " + matricula + " va a " + velocidad + "km/h. Tiene " + numPuertas + " puertas";
    }

}
