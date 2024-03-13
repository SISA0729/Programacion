package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Manager extends Empleado{
    protected boolean sonrisa;

    public Manager(String nombre, int añoNacimiento, String dirección, LocalDate fechaInicio, Long salario, boolean sonrisa) {
        super(nombre, añoNacimiento, dirección, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "sonrisa=" + sonrisa +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
