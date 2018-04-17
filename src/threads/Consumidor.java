/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

//CLASE CONSUMIDOR, ACCEDE PARA EXTRAER
//Extrae datos (int) del buffer indefinidamente.
class Consumidor extends Thread {
    private Cola _buffer;
    public Consumidor ( Cola c ) {
        _buffer = c;
    }
    public void run () {
        int dato;
        while ( true ) {
            dato = _buffer.extraer ();
            System.out.println( dato );
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
