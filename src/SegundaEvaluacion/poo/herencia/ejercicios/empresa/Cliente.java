package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, LocalDate fechaNacimiento, String telefono) {
        super(nombre, fechaNacimiento);
        int cifras = 0;
        if (telefono.length() == 9) {
            for (int i = 0; i < telefono.length(); i++) {
                if (Character.isDigit(telefono.charAt(i))) {
                    cifras++;
                }
            }
        }
        if (cifras == 9){
            this.telefono = telefono;
        }else {
            this.telefono = "Desconocido";
        }
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                '}';
    }

    public void mostrar() {
        System.out.println("\nDATOS DEL CLIENTE: ");
        System.out.println("Esto de persona: ");
        System.out.println(super.toString());
        System.out.println("Y esto de cliente");
        System.out.println(this.toString());
    }

}
