package SegundaEvaluacion.examen.ejercicio3;

public abstract class Coche extends Vehiculo {
    private int puertas;

    public Coche(String matricula) {
        super(matricula);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula" + getMatricula() + "va a X km/h. Tiene "+ velocidad + " puertas”.";
    }

    public abstract void acelerar(int km);

    public abstract void frenar(int km);
}