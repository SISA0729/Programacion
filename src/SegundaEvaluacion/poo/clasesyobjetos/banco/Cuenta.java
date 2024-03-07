package SegundaEvaluacion.poo.clasesyobjetos.banco;

public class Cuenta {
    private String codigo;
    private float balance;
    private Usuario propietario;

    // constructor parametrizado
    public Cuenta(String codigo, float balance, Usuario propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }

    // getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    // toString()

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", propietario=" + propietario +
                '}';
    }
}
