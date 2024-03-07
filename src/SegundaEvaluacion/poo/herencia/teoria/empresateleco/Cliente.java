package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Cliente extends Persona{
    protected String idContrato;
    protected boolean gold;

    public Cliente(String nombre, int añoNacimiento, String dirección, String idContrato, boolean gold) {
        super(nombre, añoNacimiento, dirección);
        this.idContrato = idContrato;
        this.gold = gold;
    }

    // aquí irían los getters y setters public para todos los atributos

    @Override
    public String toString() {
        return "Cliente{" +
                "idContrato='" + idContrato + '\'' +
                ", gold=" + gold +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
