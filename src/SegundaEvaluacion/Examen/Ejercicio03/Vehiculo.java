package SegundaEvaluacion.Examen.Ejercicio03;

class Vehiculo {
    protected String  matricula;
    int velocidad;


    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "El vehiculo con la matricula " + matricula + " va a " + velocidad + "km/h";
    }

}
