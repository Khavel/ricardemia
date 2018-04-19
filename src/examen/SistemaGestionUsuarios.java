package examen;/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */


import java.util.HashMap;

/**
 * Sistema de gestión de usuarios
 * 
 */
public class SistemaGestionUsuarios {
    
    /**
     * Número máximo de usuarios.
     */
    private int nUsuarios;
    
    /**
     * Primera posición libre.
     */
    private int primerLibre;

    
    /**
     * Diccionario que contiene usuarios con su Menú asociado
     * 
     */
    private HashMap<Usuario,Menu> sistemaAlmacen;
    
    
    /**
     * Crea un sistema de gestión de usuarios limitado en número.
     * @param nU Número total de usuarios.
      */
    public SistemaGestionUsuarios(int nU) {
        nUsuarios = nU;
        sistemaAlmacen = new HashMap<Usuario,Menu>();
        primerLibre = 0;
    }
    
    /**
     * Añade un usuario y el menú de opciones en el almacén
     * @param u Usuario.
     * @param m Menú de opciones.
     */
    public void addUsuario(Usuario u, Menu m) {
        if(sistemaAlmacen.size() == nUsuarios){

        }else{
            sistemaAlmacen.put(u,m);
        }
    }
    
    /**
     * Autentifica un usuario, y devuelve su menú si todo va bien, en caso 
     * contrario devuelve <i>null</i>.
     * 
     * Recorre la lista de usuarios, buscando un usuario con el mismo login que 
     * el suministrado, si lo encuentra comprueba que los passwords coinciden, 
     * devolviendo el menú que se encuentra en la misma posición.
     * 
     * @param login  Login de la autentificación. 
     * @param password Contraseña de la autentificación.
     * @return Menú asociado al usuario o <i>null</i>.
     */
    public Menu autentificaUsuario(String login, String password) {
        Usuario u = buscaUsuario(login, password);
        if(u == null){
            return null;
        }else{
           return sistemaAlmacen.get(u);
        }

    }

    /**
     * Da de baja un usuario dentro del sistema de gestión, siempre y cuando esté autentificado <i>null</i>.
     * 
     * 
     * @param login  Login de la autentificación. 
     * @param password Contraseña de la autentificación.
     * @return boolean 
     * @throws Exception 
     */
    public boolean bajaUsuario(String login, String password) throws Exception{
        Usuario u = buscaUsuario(login, password);
        if(u.equals(null)){
            return false;
        }else{
            sistemaAlmacen.remove(u);
            nUsuarios--;
            return true;
        }
    }

    private Usuario buscaUsuario(String login, String password){
        for(Usuario u : sistemaAlmacen.keySet()){
            if(u.login.equals(login)){
                if(u.password.equals(password)){
                    return u;
                }
            }
        }
        return null;
    }
}