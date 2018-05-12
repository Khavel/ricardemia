package exceptions;

public class ExcepcionPar extends Exception {


    public ExcepcionPar ( int x ) {
        super ("El numero es par");
        numero = x;
    }
    public int valor () {
        return ( numero );
    }

    private int numero;
}
