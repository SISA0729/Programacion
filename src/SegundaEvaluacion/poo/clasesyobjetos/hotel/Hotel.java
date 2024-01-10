package SegundaEvaluacion.poo.clasesyobjetos.hotel;

public class Hotel {
    private int idHotel;
    private Zona zona;
    private double precio;

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 39 && precio < 501){
            this.precio = precio;
        }else {
            System.out.println("ERROR");
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona=" + zona +
                ", precio=" + precio +
                '}';
    }


}
