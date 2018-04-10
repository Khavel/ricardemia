package Clase3;

import fundamentos.*;

public class testCalculadora {

    public static void main(String[] args){
        int operacion;
        Lectura l = new Lectura("Indique codigo de operacion de la calculadora:");
        l.creaEntrada("Codigo",0);
        l.esperaYCierra();
        operacion = l.leeInt("Codigo");

        Calculadora calc1 = new Calculadora(2,3);
        System.out.println("Resultado " + calc1.calcular(operacion));
/*
        calc1.setOp2(0);
        System.out.println("Resultado " + calc1.calcular(3));

*/
        System.exit(0);
    }
}
