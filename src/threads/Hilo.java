/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

class Hilo extends Thread {

    public Hilo(String str){
        super(str);
    }

    public void run(){
        System.out.println("Hola mundo 1");
        System.out.println(getName());
        try{
            sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Ha habido un error");
        }
        System.out.println("Hola mundo 2");
        System.out.println(getName());
    }
}