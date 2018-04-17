/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

public class Demo {
    public static void main (String[] args) {
        Hilo uno, dos;
        uno = new Hilo("Jamaica");
        dos = new Hilo("Fiji");

        uno.setPriority(10);
        dos.setPriority(1);
        System.out.println(uno.isAlive());
        uno.start();
        dos.start();
        
        System.out.println("main no hace nada");

    }
}