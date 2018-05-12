package threads.Ejercicios;

public class Suma extends Thread {

    CosoDeSumar c;
    public Suma(CosoDeSumar c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            c.suma();
        }

    }
}
