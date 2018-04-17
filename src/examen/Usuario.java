package examen;/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

/**
 * Usuario del Portal Web.
 * 
 */
public abstract class Usuario {
	
	
    
    /**
     * Nombre del usuario.
     */
    protected String nombre;
    
    /**
     * Login/identificador del usuario.
     */
    protected String login;
    
    /**
     * Contraseña del usuario.
     */
    protected String password;

   /**
    * Crea un usuario a partir de su nombre, login y password.
    * @param n Nombre del usuario.
    * @param l Login del usuario.
    * @param p Contraseña del usuario.
 * @throws Exception 
    */
    public Usuario (String n, String l, String p) throws Exception {
    	this.nombre = n;
    	this.login = l;
    	if(p.length() >= 5){
            this.password = p;
        }else{
    	    throw new Exception();
        }

    			
    }

   /**
    * Obtiene el login del usuario.
    * 
    * @return Login.
    */
    public String getLogin() {
    	return this.login;
    }
    
   /**
    * Obtiene el nombre del usuario.
    * @return Nombre.
    */
    public String getNombre() {
    	return this.nombre;
    }
    
   /**
    * Obtiene la contraseña.
    * @return Contraseña.
 * @throws Exception 
    */
    public String getPassword() throws Exception {
    	return this.password;
    			
    }
    /**
    *Muestra por pantalla el tipo de usuario: Administrador o usuario sin privilegios
    */
    public abstract void tipoUsuario();
    
}