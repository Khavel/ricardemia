/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package DataStructures;

public class Alumno {

    private String nombre;


    private String dni;

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre(){
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
}
