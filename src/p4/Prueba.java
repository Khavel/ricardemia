package p4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Prueba {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//HashMap para relacionar dni y alumnos.
        HashMap<String,Alumno> alumnos = new HashMap<String,Alumno>();
        cargarContenido("c:/ficheroalumno.txt",alumnos);
        Collection<Alumno> coleccion = alumnos.values();
        for(Alumno a : coleccion){
            System.out.println(a.getNombre());
            System.out.println(a.getApellidos());
            System.out.println(a.getNotaMedia());
            tipoAlumno(a);
            System.out.println("-------------");
        }
//Búsqueda de un alumno a partir de un DNI
        Alumno a = alumnos.get("55667788P");
        if(a==null)
            System.out.println("No se ha encontrado el alumno");
        else{
            System.out.println("Nombre: " + a.getNombre());
            System.out.println("Apellidos: " + a.getApellidos());
            System.out.println("Nota media: " + a.getNotaMedia());
            tipoAlumno(a);
        }
    }

    public static void cargarContenido(String archivo, HashMap<String,Alumno> la) throws
            FileNotFoundException, IOException {


        Alumno a = null;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        ArrayList<String> arraylist = cargarArray(b);
        Iterator<String> it = arraylist.iterator();
        while(it.hasNext()){
            String linea;
            String dni = null;
            String nombre = null;
            String apellidos = null;
            String nota = null;
            String becario = null;
            linea = it.next();
            if(it.hasNext()){
                dni = it.next();
            }
            if(it.hasNext()){
                nombre = it.next();
            }
            if(it.hasNext()){
                apellidos = it.next();
            }
            if(it.hasNext()){
                nota = it.next();
            }
            if(it.hasNext()){
                becario = it.next();
            }

            if(linea.equals("GII")){
                a = new AlumnoGII(nombre,apellidos,Float.parseFloat(nota),Boolean.parseBoolean(becario));
            }else if(linea.equals("GIIAA"))
                a = new AlumnoGIIAA(nombre,apellidos,Float.parseFloat(nota),Boolean.parseBoolean(becario));
            else if(linea.equals("GIOI"))
                a = new AlumnoGIOI(nombre,apellidos,Float.parseFloat(nota),Boolean.parseBoolean(becario));
            if(a != null){
                la.put(dni, a);
            }

        }
        b.close();
    }

    /**
     * Muestra por pantalla el grado al que pertenece el alumno.
     *
     * @param a Alumno que deseamos confirmar su grado
     */
    public static void tipoAlumno(Alumno a){
        if(a instanceof AlumnoGII)
            System.out.println("Pertenece al GII");
        else if (a instanceof AlumnoGIOI)
            System.out.println("Pertenece al GIOI");
        else if (a instanceof AlumnoGIIAA)
            System.out.println("Pertenece al GIIAA");
    }

    public static ArrayList<String> cargarArray( BufferedReader b) throws IOException{
        ArrayList<String> arraylist = new ArrayList<String>();
        String cadena = null;
        while((cadena = b.readLine()) != null){
            arraylist.add(cadena);
        }
        return arraylist;
    }
}
