package teoria.interfaces;

public interface InterfazConTodoLoQuePuedeTener {
    int CONSTANTE = 0;

    public void metodoAbstracto();
    public int calcularSuma(int num1, int num2);
    public default void metodoPorDefecto(){
        System.out.println();
        System.out.println("Este es un metodo por defecto normal y corriente");
        System.out.println("Ahora voy a usar un metodo privado " + metodoPrivado());

    }
    public static void metodoEstatico(){
        System.out.println();
        System.out.println("Este metodo es un metodo statico");
    }
    private String metodoPrivado(){
        System.out.println();
        return "Esto es un metodo privado, solo se puede usas solo desde la misma clase";
    }


}
