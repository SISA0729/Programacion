package Biblioteca;

import java.time.LocalDate;

public class Socio implements Comparable{
    private String nombre, apellidos;
    private LocalDate fechaNacimiento;

    public Socio(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;
        if (this.fechaNacimiento.isBefore(s.fechaNacimiento)){
            return 1;
        }else if (this.fechaNacimiento.isAfter(s.fechaNacimiento)){
            return -1;
        }else {
            return 0;
        }
    }



}
