package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Date;

public class Empleado extends Persona{
    protected LocalDate fechaInicio;
    protected Long salario;

    // constructor de la subclase: tiene que empezar llamando al constructor de la superclase con la palabra super

    public Empleado(String nombre, int añoNacimiento, String dirección, LocalDate fechaInicio, Long salario) {
        super(nombre, añoNacimiento, dirección);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }


    // aquí irían los getters y setters public para todos los atributos

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
