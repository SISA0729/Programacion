package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

import java.awt.*;

public class Figura {
    // Propiedades = ATRIBUTOS
    // Código. Cada figura tiene un código identificativo formado por letras y números. Dos figuras distintas no tendrán el mismo código.
    private String codigo;
    // Precio. Un double con el precio de la figura.
    private double precio;
    //Además, puesto que la figura representa a un superhéroe, será necesario que la clase Figura contenga un objeto de la clase Superhéroe que describa las características de este.
    // Un objeto superhéroe de la clase Superhéroe que defina las
    //características del superhéroe representado.
    private Superheroe superheroe;
    //Por otro lado, para definir las dimensiones de la figura, la clase Figura
    //contendrá un objeto de la clase Dimensión
    // Un objeto dimensiones de la clase Dimensión que defina las
    //dimensiones del figura.

    private Dimension dimensiones;

    //Constructores
    //Programe un constructor que reciba como parámetro el código identificativo de la figura, su precio, un objeto Dimensión, un objeto Superhéroe. Estos valores se asignarán a cada propiedad.

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    //Métodos set y get
    //Programe un set para cada propiedad (código, precio, superhéroe y
    //dimensiones). Igualmente un get para cada propiedad.

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

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }


    //Método toString
    //Programe el método toString de forma que devuelva una cadena con
    //todas las características de la figura.

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superheroe=" + superheroe +
                ", dimensiones=" + dimensiones +
                '}';
    }

    // Método modificador adicional
    //Programe un método subirPrecio(double cantidad) que reciba una cantidad de dinero. Este método subirá el precio actual de la figura en la cantidad indicada como parámetro.
    public void subirPrecio(double cantidad) {
        if (cantidad > 0) {
            this.precio = this.precio + cantidad;
            System.out.println("Nuevo precio: " + this.precio);
        }
    }
}
