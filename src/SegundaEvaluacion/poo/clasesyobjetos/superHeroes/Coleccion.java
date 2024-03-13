package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coleccion {
    // Propiedades = ATRIBUTOS
    //Las colecciones estarán descritas por la clase Colección, que tiene las
    //siguientes propiedades:
    // nombreColeccion, que será el nombre de la colección (“El Hombre
    //Murciélago”, “Marvel”, etc.)
    private String nombreColeccion;
    // Un objeto listaFiguras, que será un ArrayList que contendrá las
    //distintas figuras que forman la colección.
    private ArrayList<Figura> listaFiguras;

    //Constructor
    //Programe un constructor que reciba como parámetro el nombre de la colección.
    // Este constructor construirá el ArrayList listaFiguras, (que estará vacío inicialmente)

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    //Metodos get y set
    //Programe un get y set para la propiedad nombreColeccion.

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Métodos modificadores
    //Programe un método añadirFigura(Figura fig), que reciba como parámetro una figura y la añada al listado de figuras de la colección.
    public void añadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    //Programe un método subirPrecio(double cantidad, String id) que reciba una cantidad de dinero y el identificador de una de las figuras de la colección. El método subirá el precio de dicha figura en la cantidad pasada como parámetro.

    //Método toString y similares
    //Programe el método toString, de forma que devuelva una cadena con el
    //listado de todas las figuras de la colección con todas las características de
    //cada uno.
    //Programe un método conCapa() que devuelva una cadena con el listado
    //de aquellas figuras de la colección que tengan capa.
    //Otros métodos observadores
    //Programe un método masValioso() que devuelva la figura que tenga el
    //precio mayor de la colección.
    //Programe un método getValorColeccion(), que devuelva un double con el
    //precio total de la colección (es la suma de los precios de cada figura de la
    //colección)
    //Programe un método getVolumenColeccion(), que devuelva un double con
    //el volumen aproximado que ocuparía toda la colección de figuras. Para
    //hacer este cálculo se deben sumar los volúmenes de cada figura, y
    //añadirle al resultado el valor 200.

}
