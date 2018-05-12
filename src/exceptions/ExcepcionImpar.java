package exceptions;

public class ExcepcionImpar extends Exception {


    public ExcepcionImpar ( int x ) {
        super ("El numero es impar");
        numero = x;
    }
    public int valor () {
        return ( numero );
    }

    private int numero;
}

