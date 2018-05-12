package threads.Ejercicios;

public class HolaMundos implements Runnable {
    private int id;
    public HolaMundos (int id) {
        this.id = id;

    }
    @Override
    public void run() {

        try{
            int sleepTime = id * 1000;
            Thread.sleep(sleepTime);
            System.out.println("Hola mundo!"+id);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
