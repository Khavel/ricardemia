package examen;/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */


import java.util.HashMap;

/**
 * Sistema de gesti�n de usuarios
 * 
 */
public class SistemaGestionUsuarios {
    
    /**
     * N�mero m�ximo de usuarios.
     */
    private int nUsuarios;
    
    /**
     * Primera posici�n libre.
     */
    private int primerLibre;

    
    /**
     * Diccionario que contiene usuarios con su Men� asociado
     * 
     */
    private HashMap<Usuario,Menu> sistemaAlmacen;
    
    
    /**
     * Crea un sistema de gesti�n de usuarios limitado en n�mero.
     * @param nU N�mero total de usuarios.
      */
    public SistemaGestionUsuarios(int nU) {
        nUsuarios = nU;
        sistemaAlmacen = new HashMap<Usuario,Menu>();
        primerLibre = 0;
    }
    
    /**
     * A�ade un usuario y el men� de opciones en el almac�n
     * @param u Usuario.
     * @param m Men� de opciones.
     */
    public void addUsuario(Usuario u, Menu m) {
        if(sistemaAlmacen.size() == nUsuarios){

        }else{
            sistemaAlmacen.put(u,m);
        }
    }
    
    /**
     * Autentifica un usuario, y devuelve su men� si todo va bien, en caso 
     * contrario devuelve <i>null</i>.
     * 
     * Recorre la lista de usuarios, buscando un usuario con el mismo login que 
     * el suministrado, si lo encuentra comprueba que los passwords coinciden, 
     * devolviendo el men� que se encuentra en la misma posici�n.
     * 
     * @param login  Login de la autentificaci�n. 
     * @param password Contrase�a de la autentificaci�n.
     * @return Men� asociado al usuario o <i>null</i>.
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
     * Da de baja un usuario dentro del sistema de gesti�n, siempre y cuando est� autentificado <i>null</i>.
     * 
     * 
     * @param login  Login de la autentificaci�n. 
     * @param password Contrase�a de la autentificaci�n.
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