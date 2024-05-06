package teoria.comparatorlambda.eje.Hote;

import java.util.Objects;

public class Hotel implements Comparable {
    private int id;
    private String zona;
    private double precio;

    public Hotel(int id, String zona, double precio) {
        this.id = id;
        this.zona = zona;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", zona='" + zona + '\'' +
                ", precio=" + precio +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Hotel h1 = (Hotel) o;
        return Double.compare(((Hotel) o).getPrecio(), this.precio);
        // Ordenamos de mayor a menor precio
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id && Double.compare(precio, hotel.precio) == 0 && Objects.equals(zona, hotel.zona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zona, precio);
    }
}
