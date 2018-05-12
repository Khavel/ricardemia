package threads.Ejercicios;

public class Tortuga extends Thread {

    private int casillas = 10;
    private int casillaActual = 0;

    @Override
    public void run() {
        boolean meta = false;
        while(!meta){
            try {
                sleep(1000);
                double accion = Math.random();
                if(accion <= 0.5){
                    casillaActual = casillaActual + 3;
                    System.out.println("Tortuga avanza rapido");
                }else if(accion > 0.5 && accion <= 0.7){
                    casillaActual = casillaActual - 6;
                    System.out.println("Tortuga resbala");
                }else if(accion > 0.7 && accion <= 1){
                    casillaActual = casillaActual + 1;
                    System.out.println("Tortuga avanza lento");
                }
                System.out.println("Tortuga posicion: " + casillaActual);
                if(casillaActual >= casillas){
                    meta = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Tortuga termina");
    }
}
