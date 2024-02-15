package SegundaEvaluacion.colecciones.Ejercicios.ejercicio04;

public class MainPruebas {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();

        diccionario.nuevoPar("Perro","Dog");
        diccionario.nuevoPar("Gato","cat");
        diccionario.nuevoPar("Mesa","table");
        diccionario.nuevoPar("silla","chair");

        String traduccion = diccionario.traduce("Perro");
        System.out.println(traduccion);

        System.out.println("Palabra aleatoria " + diccionario.palabraAleatoria());

        String teaduccion2 = diccionario.primeraLetraTraduccion("Mesa");
        System.out.println(teaduccion2);
    }
}
