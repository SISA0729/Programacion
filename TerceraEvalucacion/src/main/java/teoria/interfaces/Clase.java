package teoria.interfaces;

public class Clase implements InterfazConTodoLoQuePuedeTener{

    @Override
    public void metodoAbstracto() {
        System.out.println("Metodo abstracto que hemos desarrollado en la clase ");

    }

    @Override
    public int calcularSuma(int num1, int num2) {
        return num1 + num2;
    }

}
