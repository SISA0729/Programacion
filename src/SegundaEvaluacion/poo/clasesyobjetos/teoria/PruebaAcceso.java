package SegundaEvaluacion.poo.clasesyobjetos.teoria;
import SegundaEvaluacion.poo.clasesyobjetos.teoria.acceso.*;
import SegundaEvaluacion.poo.clasesyobjetos.teoria.acceso.Protegida;
import SegundaEvaluacion.poo.clasesyobjetos.teoria.acceso.Publica;

public class PruebaAcceso {
    public static void main(String[] args) {
        Publica objetoPublico = new Publica();
        ProteccionDePaquete objetoPP = new ProteccionDePaquete();

        System.out.println(objetoPP);


    }
}
