package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Manager extends Empleado{
    protected boolean sonrisa;

    public Manager(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "sonrisa=" + sonrisa +
                ", fecha_inicio=" + fecha_inicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
