/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

class Cola {
    private int [] _datos;
    private int _sigEnt, _sigSal, _ocupados, _tamano;
    public Cola ( int tam ) {
        _datos = new int [ tam ];
        _tamano = tam;
        _ocupados = 0;
        _sigEnt = 1;
        _sigSal = 1;
    }
    public synchronized void almacenar ( int x ) {
        try {
            while ( _ocupados == _tamano ) wait ();
            _datos [ _sigEnt ] = x;
            _sigEnt = ( _sigEnt + 1 ) % _tamano;
            _ocupados++;
            notifyAll();
        }
        catch ( InterruptedException e ) {}
    }
    public synchronized int extraer () {
        int x = 0;
        try {
            while ( _ocupados == 0 ) wait();
            x = _datos [ _sigSal ];
            _sigSal = ( _sigSal + 1 ) % _tamano;
            _ocupados--;
            notifyAll();
        }
        catch ( InterruptedException e ) {}
        return x;
    }
}
