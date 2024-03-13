package SegundaEvaluacion.poo.clasesyobjetos.banco;

public class Usuario {
    // atributos
    private String login;
    private String nombre;
    private String apellidos;

    // constructor parametrizado

    public Usuario(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // getters y setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    // toString()

    @Override
    public String toString() {
        return " nombre= "+ nombre
                + ", apellidos='" + apellidos + '\'';
    }
}
