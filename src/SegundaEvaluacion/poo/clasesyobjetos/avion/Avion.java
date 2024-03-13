package SegundaEvaluacion.poo.clasesyobjetos.avion;

public class Avion {
    private String Nombre;
    private int Aforo;
    private int Velocidad;
    private double Cordenadas;

    public Avion(String nombre, int aforo, int velocidad, double cordenadas) {
        Nombre = nombre;
        Aforo = aforo;
        Velocidad = velocidad;
        Cordenadas = cordenadas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int aforo) {
        Aforo = aforo;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    public double getCordenadas() {
        return Cordenadas;
    }

    public void setCordenadas(double cordenadas) {
        Cordenadas = cordenadas;
    }
}
