package lasbatallasdelasalmas;

public class MainPrueba {
    public static void main(String[] args) {
        Angel angel = new Angel(20);
        Demonio demonio = new Demonio(30);
        angel.mostrar();
        demonio.mostrar();

        Humano humano = new Humano(50);

        for (int i = 0; i < 14; i++) {
            if (i % 3 == 0){
                humano.rezar();
            }
        }

        humano.mostrar();
        humano.rezar();
        humano.mostrar();
        humano.pecar();
        humano.mostrar();
    }
}
