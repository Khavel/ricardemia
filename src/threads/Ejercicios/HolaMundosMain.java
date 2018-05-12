package threads.Ejercicios;

import java.util.ArrayList;

public class HolaMundosMain {

    public static void main(String[] args){
        ArrayList<HolaMundos> h = new ArrayList<>();

        for(int i=0;i<10;i++){
            h.add(new HolaMundos(i));
            Thread t = new Thread(h.get(i));
            t.start();
        }
    }

}
