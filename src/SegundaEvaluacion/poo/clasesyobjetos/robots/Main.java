package SegundaEvaluacion.poo.clasesyobjetos.robots;

public class Main {
    public static void main(String[] args) {
        // con este llamo al constructor sin parámetros
        Robot robot1 = new Robot();
        System.out.println(robot1);

        // con este llamo al constructor que tiene los tres parámetros
        Robot robot2 = new Robot("Mazinger", "Z", 2000);
        System.out.println(robot2);

        // con este llamo al constructor que tiene dos parámetros
        Robot robot3 = new Robot("Afrodita", "A");
        System.out.println(robot3);
    }
}
