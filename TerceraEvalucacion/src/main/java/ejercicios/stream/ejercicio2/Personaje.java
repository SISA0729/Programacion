package ejercicios.stream.ejercicio2;

public class Personaje {
    private String nombre;
    private int edad;
    private String arma;
    private  boolean humano;

    public Personaje(String nombre, int edad, String arma, boolean humano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.humano = humano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", arma='" + arma + '\'' +
                ", humano=" + humano +
                '}';
    }
}
