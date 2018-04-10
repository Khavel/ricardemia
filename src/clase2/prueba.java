/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package clase2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class prueba {

    public static void main(String[] args) throws IOException {
        //Ejemplo 1
        Set<String> set1 = new TreeSet<String>();
        set1.add("Hola");
        set1.add("aHola");
        set1.add("Adios");
        for(String s : set1){
            System.out.println(s);

        }

        //Ejemplo 2
        Set<Usuario> set2 = new TreeSet<Usuario>();
        set2.add(new Usuario("1","Alex","Oceja"));
        set2.add(new Usuario("2","Pepe","Perez"));
        set2.add(new Usuario("3","Roberto","Rodriguez"));
        set2.add(new Usuario("2","Gonzalo","Gonzalez"));
        set2.add(new Usuario("4","Luis","Lopez"));
        set2.add(new Usuario("5","Alex","Perez"));
        for(Usuario s : set2){
            System.out.println(s.getNombre() + " " + s.getApellido());

        }

        //Ejemplo 3
        Map<String,Usuario> map1 = new TreeMap<String,Usuario>();
        for(Usuario s : set2){
            map1.put(s.getDni(),s);
        }

        for(String k:map1.keySet()){
            System.out.println(k);
        }
        for(Usuario u : map1.values()){
            System.out.println(u.toString());
        }


        FileReader f = null;
        try {
            f = new FileReader("c:/marcas1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        BufferedReader b = new BufferedReader(f);
        String marca = b.readLine();
        List<String> marcas1 = new ArrayList<String>();

        while(marca != null){
            marcas1.add(marca);
            marca = b.readLine();
        }

        f = null;
        try {
            f = new FileReader("c:/marcas2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        b = new BufferedReader(f);
        marca = b.readLine();
        List<String> marcas2 = new ArrayList<String>();

        while(marca != null){
            marcas2.add(marca);
            marca = b.readLine();
        }
        boolean esta = false;
        for(int i=0;i<marcas1.size();i++){
            esta = false;
            for(int j=0;j<marcas2.size();j++){
                if(marcas1.get(i).equals(marcas2.get(j))){
                    esta = true;
                    break;
                }
            }
            if(!esta){
                marcas1.remove(i);
            }
        }


    }
}
