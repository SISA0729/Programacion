package SegundaEvaluacion.examen.ejercicio3;

public abstract class Vehiculo {
    private String matricula;
    int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String recuperarMatricula(){
        return this.matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "El vehículo con matrícula" + matricula + "va a " + velocidad + " km/h”.";
    }

}
