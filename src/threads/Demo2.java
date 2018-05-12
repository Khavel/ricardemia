/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

public class Demo2 {
    public static void main (String[] args) {
        Hilo2 h1, h2;

        h1 = new Hilo2("Jamaica");
        h2 = new Hilo2("Fiji");

        Thread t1;
        Thread t2;
        t1= new Thread(h1);
        t2= new Thread(h2);

        t1.start();
        t2.start();
    }
}
