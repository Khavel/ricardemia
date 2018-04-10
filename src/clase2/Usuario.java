/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package clase2;

public class Usuario implements Comparable<Usuario>{

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private String nombre,apellido,dni;


    public Usuario(String dni,String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public int compareTo(Usuario o) {
        //Esto seria lo basico
        //return this.nombre.compareTo(o.getNombre());

        //Implementacion manual
        char c1,c2;
        c1 = this.nombre.charAt(0);
        c2 = o.getNombre().charAt(0);

        if(c1 < c2){
            return -1;
        }else if(c1 > c2){
            return 1;
        }else return 0;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
