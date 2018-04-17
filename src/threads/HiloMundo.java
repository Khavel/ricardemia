/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

class HiloMundo extends Thread {
    int num;
    public HiloMundo(String str, int num) {
        super(str);
        this.num = num;
    }
    public void run() {


            try {
                sleep(num * 1000);
                System.out.println("Hilo " + getName() + "  Hola Mundo");
            }
            catch (InterruptedException e) {}


    }
}
