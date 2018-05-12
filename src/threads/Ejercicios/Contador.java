package threads.Ejercicios;

public class Contador {

    private static int contador = 0;

    public static void main(String[] args){

        for(int i=0;i<=4;i++){
            Incrementador inc = new Incrementador();
            inc.start();
        }

    }

    public static void addContador(){

        contador ++;
    }

    public static int getContador(){
        return contador;
    }
}
