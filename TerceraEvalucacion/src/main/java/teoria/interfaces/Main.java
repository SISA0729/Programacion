package teoria.interfaces;

public class Main {
    public static void main(String[] args) {
        Clase clase = new Clase();
        clase.metodoAbstracto();
        System.out.println(clase.calcularSuma(2,2));
        clase.metodoPorDefecto();
        InterfazConTodoLoQuePuedeTener.metodoEstatico();
    }
}
