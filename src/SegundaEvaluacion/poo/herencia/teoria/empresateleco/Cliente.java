package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Cliente extends Persona{
    protected String idContrato;
    protected boolean status;

    public Cliente(String idContrato, boolean status) {
        this.idContrato = idContrato;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idContrato='" + idContrato + '\'' +
                ", status=" + status +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
