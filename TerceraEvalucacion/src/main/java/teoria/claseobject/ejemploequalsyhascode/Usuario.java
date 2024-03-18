package teoria.claseobject.ejemploequalsyhascode;

import java.util.Objects;

public class Usuario {
    private String login,password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(login, usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }



    @Override
    public String toString() {
        return "Usuario{" + login + " \n" +
                "Contraseña:  " + password;
    }
}
