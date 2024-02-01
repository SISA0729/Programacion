package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;
import SegundaEvaluacion.poo.clasesyobjetos.*;

public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimencion dimenciones;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimencion dimenciones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimenciones = dimenciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimencion getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(Dimencion dimenciones) {
        this.dimenciones = dimenciones;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimenciones=" + dimenciones +
                '}';
    }
    public void subirPrecio(double cantidad){
        if(cantidad > 0){
            this.precio = this.precio + cantidad;
            System.out.println("nuevo precio: " + this.precio);
        }
    }
}
