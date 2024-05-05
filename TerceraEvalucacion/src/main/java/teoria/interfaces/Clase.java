package teoria.interfaces;

public class Clase implements InterfazConTodoLoQuePuedeTener{
    @Override
    public void metodoAbstracto1() {
        System.out.println("Este es el método abstracto que hemos desarrollado en la clase\n");
    }

    @Override
    public int calcularSuma(int num1, int num2) {
        return num1 + num2;
    }


}
