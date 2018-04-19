package examen;

public class UsuarioSinPrivilegio extends Usuario {
    public UsuarioSinPrivilegio(String nombre, String login, String password) throws Exception {
        super(nombre,login,password);
    }

    @Override
    public void tipoUsuario() {
        System.out.println("Usuario sin privilegios");
    }
}
