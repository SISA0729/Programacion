package SegundaEvaluacion.examen.ejercicio3;

public class cocheAutomatico extends Coche{
    public cocheAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public String toString() {
        return super.toString() +"\n* Es un coche automático.";
    }

    @Override
    public void acelerar(int km) {
        this.velocidad += km;
        System.out.println("Acelerando...");
        this.toString();
    }

    @Override
    public void frenar(int km) {
        this.velocidad -= km;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println("Frenando...");
        this.toString();
    }

}
