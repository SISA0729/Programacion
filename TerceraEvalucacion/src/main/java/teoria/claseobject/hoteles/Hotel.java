package teoria.claseobject.hoteles;

import java.util.Objects;

public class Hotel implements Comparable{
    private String idHotel;
    private String zona;
    private double precio;

    public Hotel(String idHotel, String zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
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
                "idHotel='" + idHotel + '\'' +
                ", zona='" + zona + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Double.compare(precio, hotel.precio) == 0 && Objects.equals(idHotel, hotel.idHotel) && Objects.equals(zona, hotel.zona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, zona, precio);
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
