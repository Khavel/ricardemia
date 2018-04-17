package DataStructures;

import fundamentos.*;

import java.util.ArrayList;

public class EjercicioArrayList {

    public static void main(String[] args){
        Lectura l = new Lectura("Mete numeros");

        ArrayList<Double> listaNumeros = new ArrayList<>();

        for(int i =0;i<9;i++){
            l.creaEntrada("numero" + i,0.0);
        }
        l.esperaYCierra();
        for (int i=0;i<9;i++){
            listaNumeros.add(l.leeDouble("numero" + i));
        }
        for(int i=0;i<9;i++){
            System.out.println(listaNumeros.get(i));
        }

        System.exit(0);
    }
}
