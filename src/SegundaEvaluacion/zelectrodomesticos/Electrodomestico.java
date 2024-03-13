package SegundaEvaluacion.zelectrodomesticos;

public class Electrodomestico {
    // Propiedades
    private String tipo;
    private String marca;
    private double potencia;

    // Constructor
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    // Métodos get y set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    // Método toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    // Método getConsumo
    public double getConsumo(int horas) {
        return potencia * horas;
    }

    // Método getCosteConsumo
    public double getCosteConsumo(int horas, double costeHora) {
        return potencia * horas * costeHora;
    }
}
