package SegundaEvaluacion.viajes;

import java.time.LocalDate;

public class ViajeTren extends Viaje{
    private double precio;
    private String tipoTren;

    public ViajeTren(String destino, LocalDate fechaIncio, LocalDate fechaSalida, int numeroPajeros, double precio, String tipoTren) {
        super(destino, fechaIncio, fechaSalida, numeroPajeros);
        this.precio = precio;
        this.tipoTren = tipoTren;
    }

    @Override
    public double calcularCosteTotal() {

        return this.precio * numeroPajeros;
    }
}
