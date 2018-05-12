package threads.Ejercicios;

public class Conejo implements Runnable {

    private int casillas = 10;
    private int casillaActual = 0;

    @Override
    public void run() {
        boolean meta = false;
        while(!meta){
            try {
                Thread.sleep(1000);
                double accion = Math.random();
                if(accion <= 0.2){
                    System.out.println("Liebre duerme");
                    Thread.sleep(2000);
                }else if(accion > 0.2 && accion <= 0.4){
                    System.out.println("Liebre gran salto");
                    casillaActual = casillaActual + 9;
                }else if(accion > 0.4 && accion <= 0.5){
                    System.out.println("Liebre gran resbalon");
                    casillaActual = casillaActual - 12;
                }else if(accion > 0.5 && accion <= 0.8){
                    System.out.println("Liebre pequeño salto");
                    casillaActual = casillaActual + 1;
                }else if(accion > 0.8 && accion <= 1){
                    System.out.println("Liebre pequeño resbalon");
                    casillaActual = casillaActual - 2;
                }
                System.out.println("Liebre posicion: " + casillaActual);
                if(casillaActual >= casillas){
                    meta = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Liebre termina");
    }
}
