package zelectrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico lavadora = new Electrodomestico("Lavadora", "Samsung", 1.2);
        System.out.println(lavadora); // Imprime las características del electrodoméstico

        int horas = 5;
        double costeHora = 0.15; // Supongamos que el precio del kW/hora es 0.15 euros
        System.out.println("Consumo en " + horas + " horas: " + lavadora.getConsumo(horas) + " kW");
        System.out.println("Coste de consumo en " + horas + " horas: " + lavadora.getCosteConsumo(horas, costeHora) + " euros");

    }
}
