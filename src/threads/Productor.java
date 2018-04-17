/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;
//CLASE PRODUCTOR, ACCEDE PARA ALMACENAR
//Genera datos (int) y los almacena en
//el buffer indefinidamente.
class Productor extends Thread {
    private Cola _buffer;
    public Productor ( Cola c ) {
        _buffer = c;
    }
    public void run () {
        int valor = 0;
        while ( true ) {
            _buffer.almacenar ( valor );
            valor++;
        }
    }
}
