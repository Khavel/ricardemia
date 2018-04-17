package threads.Ejercicios;

public class jointest {
    public static void main (String[] args) {
        Vector a, b;
        a = new Vector (50, "a");
        b = new Vector (100, "b");
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        }
        catch (InterruptedException e) {}
        System.out.println("Suma (x) a: " + a.suma());
        System.out.println("Suma (x) b: " + b.suma());
        System.out.println("Suma (x^2) a: " + a.sumaSqr());
        System.out.println("Suma (x^2) b: " + b.sumaSqr());
        System.out.println("Media a: " + a.media());
        System.out.println("Media b: " + b.media());
    }
}
