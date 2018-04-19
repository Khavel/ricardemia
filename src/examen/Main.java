package examen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Usuario> listaUsuarios = new ArrayList<>();

        //Admins
        for (int i=1;i<4;i++){
            String nombre;
            String login;
            String password;
            nombre = "usuario" + i;
            login = "administrador" + i;
            password = "password" + i;
            try{
                listaUsuarios.add(new Administrador(nombre,login,password));
            }catch(Exception e){
                System.out.println("Contraseña demasiado corta");
            }

        }


        for (int i=1;i<4;i++){
            String nombre;
            String login;
            String password;
            nombre = "usuario" + i+3;
            login = "usuario sin privilegios" + i;
            password = "password" + i+3;
            try {
                listaUsuarios.add(new UsuarioSinPrivilegio(nombre,login,password));
            } catch (Exception e) {
                System.out.println("Contraseña demasiado corta");
            }
        }

        SistemaGestionUsuarios sistema = new SistemaGestionUsuarios(6);
        for(Usuario u:listaUsuarios){
            Menu m = new Menu(5);
            sistema.addUsuario(u,m);
        }

        if(sistema.autentificaUsuario("administrador1","password1") != null){
            System.out.println("ok");
        }

        if(sistema.autentificaUsuario("administrador1","password1") != null){
            System.out.println("ok");
        }

        if(sistema.autentificaUsuario("administrador7","password1") == null){
            System.out.println("No ok");
        }

        if(sistema.autentificaUsuario("administrador4","password1") == null){
            System.out.println("No ok");
        }

        for(Usuario u:listaUsuarios){
            try {
                sistema.bajaUsuario(u.getLogin(),u.getPassword());
            } catch (Exception e) {
                System.out.println("Ha habido un error");
            }
        }

        if(sistema.autentificaUsuario("administrador1","password1") != null){
            System.out.println("ok");
        }else{
            System.out.println("No ok");
        }

    }
}


/*
usuario1 administrador1 password1
usuario2 administrador2 password2
usuario3 administrador3 password3

usuario4 usuarioSinPrivilegios1 password4
usuario5 usuarioSinPrivilegios2 password5
usuario6 usuarioSinPrivilegios3 password6
 */