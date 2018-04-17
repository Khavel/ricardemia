/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

public class Demo2 {
    public static void main (String[] args) {
        Hilo2 uno, dos;
        uno = new Hilo2("Jamaica");
        dos = new Hilo2("Fiji");
        System.out.println("main no hace nada");
    }
}
