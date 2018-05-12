package exceptions;

import fundamentos.*;
public class DivisionPorCero {
    public static void main(String[] args)
    {
        int i, j;
        int div=0;
        Lectura leer = new Lectura("Enteros");
        leer.creaEntrada("i",0);
        leer.creaEntrada("j",0);
        leer.espera("introduce datos");
        i=leer.leeInt("i");
        j=leer.leeInt("j");
        System.out.println("Divide...");
        try{
            div = i/j;
        }catch(Exception e){
            System.out.println("error!");
        }

        System.out.println("i/j="+div);
    } // fin main
} // fin DivisionPorCero