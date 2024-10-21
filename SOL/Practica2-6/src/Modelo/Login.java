package Modelo;

import java.util.ArrayList;

public class Login {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Login() {
        if (usuarios.isEmpty()) {
            usuarios.add(new Usuario("Ignacio", "1234"));
            usuarios.add(new Usuario("Juan", "1234"));
            usuarios.add(new Usuario("Sergio", "1234"));
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean validacionUsuarios(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
