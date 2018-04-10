package Clase3;

import fundamentos.Lectura;
public class DiasSemana {

    public static void main(String[] args) {

        int f = 1;
        for(int i=1;i<=30;i++){
            f = f*i;
        }

        System.out.println(f);

        int n = 88625838;
        int contador = 0;

        while(n != 0){
            n = n/10;
            contador ++; //contador = contador + 1
        }
        System.out.println(contador);
    }
}
