package SegundaEvaluacion.poo.clasesyobjetos.cajero;

public class CuentaCorriente {
    private String dni;
    private String nombre;
    private double salario;

    public CuentaCorriente(String dni, double salario) {
        this.dni = dni;
        this.salario = salario;
    }

    public CuentaCorriente(String dni, String nombre, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
}
