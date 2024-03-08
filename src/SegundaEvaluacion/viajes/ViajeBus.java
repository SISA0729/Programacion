package SegundaEvaluacion.viajes;

import java.time.LocalDate;

public class ViajeBus extends Viaje{
    private double precio;
    private String tipoBus;

    public ViajeBus(String destino, LocalDate fechaIncio, LocalDate fechaSalida, int numeroPajeros, double precio, String tipoBus) {
        super(destino, fechaIncio, fechaSalida, numeroPajeros);
        this.precio = precio;
        this.tipoBus = tipoBus;
    }

    @Override
    public double calcularCosteTotal() {
        return this.precio * this.numeroPajeros;
    }
}
