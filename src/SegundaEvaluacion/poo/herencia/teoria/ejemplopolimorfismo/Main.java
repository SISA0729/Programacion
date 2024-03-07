package SegundaEvaluacion.poo.herencia.teoria.ejemplopolimorfismo;

public class Main {
    public static void main(String[] args) {
        Fichero img = new Imagen("\\ruta\\al\\fichero\\img.png", 480, 640, new byte[]{4, 32});// aquí asignamos un objeto

        img.imprimeInfoFichero();
// Imprime "Imagen: \ruta\al\fichero\img.png, width: 480, height: 640"
    }
}
