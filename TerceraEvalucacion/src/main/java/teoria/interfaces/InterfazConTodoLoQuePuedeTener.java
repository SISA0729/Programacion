package teoria.interfaces;

public interface InterfazConTodoLoQuePuedeTener {
    // puede tener constantes
    int CONSTANTE = 0; // si fuera una clase normal habría que poner public static final

    // puede tener MÉTODOS ABSTRACTOS: en vez de desarrollarlos aquí, los tendran que desarrollar las clases NO ABSTRACTAS que implementen esa interfaz
    public void metodoAbstracto1(); // a pesar de no poner la palabra abstract, que aquí es opcional
    public int calcularSuma(int num1, int num2); // esto es otro método abstracto

    // puede tener métodos por defecto (default) : Y HAY QUE DESARROLLARLOS AQUÍ
    public default void metodoPorDefecto() {
        System.out.println("Este es un método por defecto normal y corriente que está desarrolado en la interfaz. Estará disponible en la clases que la implementen.");
        System.out.println("Y aquí llamamos al método privado" + metodoPrivado());
    }

    public static void metodoEstatico() {
        System.out.println("Esto es un método estático que está desarrollado en la interfaz y estará disponible en las clases que la implementen.");
        System.out.println("Y ahora voy a utilizar el método privado que tengo a continuación: bueno, mejor no");

    }

    private String metodoPrivado() {
       return  "Este método privado sólo se puede utilizar desde esta misma interfaz.";
    }



}
