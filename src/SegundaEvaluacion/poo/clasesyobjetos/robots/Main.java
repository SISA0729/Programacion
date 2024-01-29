package SegundaEvaluacion.poo.clasesyobjetos.robots;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println(robot1);

        Robot robot2 = new Robot("ismael", "A", 20000);
        System.out.println(robot2);

        Robot robot3 = new Robot("SISA", "B");
        System.out.println(robot3);
    }
}
