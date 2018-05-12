package threads.Ejercicios;

public class Incrementador extends Thread {

    public Incrementador(){

    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++){
            Contador.addContador();
        }
        System.out.println(Contador.getContador());
    }
}
