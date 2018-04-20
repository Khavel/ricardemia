package exceptions;

public class AleatorioExcepcion {

    public static void main(String[] args) {
        try {
            System.out.println("Generando número aleatorio");
            int entero = (int) (Math.random() * 1000);
            if (entero % 2 == 0) {
                throw new ExcepcionPar(entero);
            } else {
                throw new ExcepcionImpar(entero);
            }
        } catch (ExcepcionPar e) {
            System.out.println(e.getMessage());
            System.out.println(e.valor());

        } catch (ExcepcionImpar e) {
            System.out.println(e.getMessage());
            System.out.println(e.valor());
        }

    }

}
