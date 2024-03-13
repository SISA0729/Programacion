package SegundaEvaluacion.viajes;

import java.time.LocalDate;

public abstract class Viaje {
    protected String destino;
    protected LocalDate fechaIncio;
    protected LocalDate fechaSalida;

    protected int numeroPajeros;

    public Viaje(String destino, LocalDate fechaIncio, LocalDate fechaSalida, int numeroPajeros) {
        this.destino = destino;
        this.fechaIncio = fechaIncio;
        this.fechaSalida = fechaSalida;
        this.numeroPajeros = numeroPajeros;
    }

    public abstract double calcularCosteTotal();

}
