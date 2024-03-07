package SegundaEvaluacion.poo.clasesyobjetos.teoria.acceso;
import SegundaEvaluacion.poo.clasesyobjetos.teoria.*;

public class Main {
    public static void main(String[] args) {
        // vamos a probar a qué accedemos estando en el mismo paquete que la variable que quiero utilizar
        Publica objetoPublica = new Publica();
        System.out.println(objetoPublica.atributoPublico);
        Privada objetoPrivada = new Privada();

        ProteccionDePaquete objetoPP = new ProteccionDePaquete();
        System.out.println(objetoPP.atributoConProteccionDePaquete);

        Protegida objetoProtegida = new Protegida();
        System.out.println(objetoProtegida.atributoProtegido);

        Privada objetoPrivado = new Privada();

    }
}
