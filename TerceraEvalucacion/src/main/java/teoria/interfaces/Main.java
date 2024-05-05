package teoria.interfaces;

public class Main {
    public static void main(String[] args) {
        // creamos aquí un objeto de tipo clase y vamos a interfaz y desarrollamos o heredamos en la Clase
        Clase clase = new Clase();
        // probamos el primer método abstracto
        clase.metodoAbstracto1();

        System.out.println(clase.calcularSuma(2,2));

        clase.metodoPorDefecto(); // este lo tengo en la interfaz y la clase lo aprovecha
        // recordad que podríamos haberlo sobreescribirlo y modificarlo en la clase
        System.out.println("\n");

        // nos falta por probar el método static; este nunca se va a invocar a través de un objeto de la clase, sino con el nombre / ruta de su ubicación
        // en este caso: nombreDeLaIterfaz.nombreDelMetodo()
        InterfazConTodoLoQuePuedeTener.metodoEstatico();

    }
}
