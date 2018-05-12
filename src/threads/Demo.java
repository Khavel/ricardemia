/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

public class Demo {
    public static void main (String[] args) {
        Hilo h1,h2;
        h1 = new Hilo("Jamaica");
        h2 = new Hilo("Fiji");

        h1.start();
        h2.start();

    }
}