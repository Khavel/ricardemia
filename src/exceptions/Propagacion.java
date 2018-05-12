package exceptions;

public class Propagacion {

    public static void main(String[] args) {
        System.out.println("main: antes de intermedio");
        intermedio();
        System.out.println("main: después de intermedio");
    }

    private static int divide(int a, int b) {
        System.out.println("divide: antes de dividir");
        int div = a/b;
        System.out.println("divide: después de dividir");
        return div;
    }
    private static void intermedio() {
        /*
        System.out.println("intermedio: antes de divide");
        int div = divide(2,0);
        System.out.println("intermedio: resultado:" +div);
*/
        //Tratamiento de la excepcion

        try {
            System.out.println("intermedio: antes de " + "divide");
            int div=divide(2,0);
            System.out.println("intermedio: resultado:" + div);
         } catch (ArithmeticException e) {
            System.out.println("intermedio: tratado error " + e);
         }

    }

}
