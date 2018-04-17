/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Problema4;

public class Ejemplo {

    public static void main (String[] args){
        //Ejemplo de length, sobstring, charat, equals y contains.

        String s1 = "Hola soy el string 1";
        String s2 = "Palabro2";

        System.out.println("Tamaño del string 1" + s1.length());

        String subS1 = s1.substring(0,4);
        String subS2 = s1.substring(0);
        System.out.println("Substring 1:" + subS1);

        System.out.println("Letra en la 3º posicion de s1" + s1.charAt(2));

        boolean var = s1.equals(s2);
        System.out.println("S1 es igual a s2?" + var);
    }
}
