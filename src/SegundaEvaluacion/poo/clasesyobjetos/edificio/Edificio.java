package SegundaEvaluacion.poo.clasesyobjetos.edificio;

public class Edificio {
    //atributo

    private int plantas;
    private double metros2;
    private int año;

    //metodo constructor: perimite crear objetos a partir de esta clase

    public Edificio(int plantas, double metros2, int año) {
        this.plantas = plantas;
        this.metros2 = metros2;
        this.año = año;
    }

    //getters y setter

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public double getMetros2() {
        return metros2;
    }

    public void setMetros2(double metros2) {
        this.metros2 = metros2;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    //metodos de istancia
}
