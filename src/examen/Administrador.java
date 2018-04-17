/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package examen;

public class Administrador extends Usuario{


    private int nivelAcceso;


    /**
     * Crea un usuario a partir de su nombre, login y password.
     *
     * @param n Nombre del usuario.
     * @param l Login del usuario.
     * @param p Contraseña del usuario.
     * @throws Exception
     */
    public Administrador(String n, String l, String p, int nivelAcceso) throws Exception {
        super(n, l, p);
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public void tipoUsuario() {
        System.out.println("Administrador");
    }
}
