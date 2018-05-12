/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

class Hilo2 implements Runnable {
    private String nombre;


    public Hilo2(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Hola mundo 1");
        System.out.println(nombre);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Ha habido un error");
        }
        System.out.println("Hola mundo 2");
        System.out.println(nombre);
    }
}
