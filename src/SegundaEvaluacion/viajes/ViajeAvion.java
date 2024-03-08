package SegundaEvaluacion.viajes;

import java.time.LocalDate;

public class ViajeAvion extends Viaje{
    private double precio;

    public ViajeAvion(String destino, LocalDate fechaIncio, LocalDate fechaSalida, int numeroPajeros, double precio) {
        super(destino, fechaIncio, fechaSalida, numeroPajeros);
        this.precio = precio;
    }

    @Override
    public double calcularCosteTotal() {
        return this.precio * this.numeroPajeros;
    }
}
