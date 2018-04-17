/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

class Hilo2 implements Runnable {
    private Thread miHilo = null;
    public Hilo2 (String str) {
        miHilo = new Thread (this, str);
        miHilo.start();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + miHilo.getName());
            try {
                Thread.sleep((long)(Math.random() * 1000));
            }
            catch (InterruptedException e) {}
        }
        System.out.println("FIN! " + miHilo.getName());
    }
}
