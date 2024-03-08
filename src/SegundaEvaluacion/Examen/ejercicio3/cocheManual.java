package SegundaEvaluacion.examen.ejercicio3;

public class CocheManual extends Coche{
    private int marcha;

    public CocheManual(String matricula) {
        super(matricula);
        this.marcha = 0;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void cambiarMarcha(int velocidad){
        if (velocidad < 10) {
            marcha = 1;
        } else if (velocidad >= 10 && velocidad <= 30) {
            marcha = 2;
        } else if (velocidad > 30 && velocidad <= 50) {
            marcha = 3;
        } else if (velocidad > 50 && velocidad <= 80) {
            marcha = 4;
        } else {
            marcha = 5;
        }
    }
    @Override
    public void acelerar(int km) {
        this.velocidad += km;
        System.out.println("Acelerando...");
        this.toString();
        cambiarMarcha(velocidad);
    }

    @Override
    public void frenar(int km) {
        this.velocidad -= km;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println("Frenando...");
        this.toString();
        cambiarMarcha(this.velocidad);
    }

    @Override
    public String toString() {
        return super.toString() +"\n* Es un coche manual y hemos metido la " + this.marcha + "ª marcha.";
    }
}
