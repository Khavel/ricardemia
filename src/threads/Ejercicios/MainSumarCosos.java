package threads.Ejercicios;

public class MainSumarCosos {

    public static void main(String[] args) throws InterruptedException {
        CosoDeSumar c = new CosoDeSumar();
        for(int i=0;i<6;i++){
            Suma s = new Suma(c);
            s.start();

        }
        System.out.println(c.getResultado());
    }
}
