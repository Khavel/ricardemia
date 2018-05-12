package LecturaFicheros;

import DataStructures.Alumno;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscribirFichero {

    public static void main (String[] args){
        escribeFichTexto("fich.txt",20,22.4,"holamundo");
        generaListado("Alumnos");
    }

    public static void escribeFichTexto(String nomFich, int i, double x, String str){

/*
             PrintWriter out = null;
             try {
             // crea los streams y los conecta
             out = new PrintWriter(new FileWriter(nomFich));
             // escribe los datos en el fichero
             out.println("Hola");
             ...
             } catch (IOException e){
                ...
             } finally { if (out != null) {
             // cierra los streams
             out.close();
             }
             }
         */
        // crea los streams y los conecta, en el try. Al ser un try con parentesis, el recurso usado se cierra automaticamente, se haga el catch o no
        try (PrintWriter out = new PrintWriter(new FileWriter(nomFich))){ // escribe los datos en el fichero
            out.println("Entero: "+i+" Real: "+x);
            out.println("String: "+str);
        } catch (IOException e){
        System.out.println("Error al abrir "+nomFich);
    }
    }

    /**
     * Genera un listado de los alumnos del curso en un
     * fichero de texto
     * @param nomFich nombre del fichero generado
     */
    public static void generaListado(String nomFich){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pepe","1234"));
        listaAlumnos.add(new Alumno("Julio","5678"));
        try (PrintWriter out=new PrintWriter(new FileWriter(nomFich))) {
            // escribe el listado alumno por alumno
            for(Alumno a: listaAlumnos) {
                // nombre con 25 carac. justificado a la izq.
                // nota con 4 carac. totales con un decimal
                out.printf("%-25s DNI:%s%n", a.getNombre(),a.getDni()); }
        } catch (IOException e){
            System.out.println("Error al abrir "+nomFich);
        }
    }
}
