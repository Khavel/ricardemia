package exceptions;

import fundamentos.Lectura;

public class ErrorRecuperable {

    public static void main(String[] args){
        double nota1, nota2;
        boolean notasCorrectas = false;
        Lectura lec = new Lectura("Lee notas");
        lec.creaEntrada("Nota parcial 1",5.0);
        lec.creaEntrada("Nota parcial 2",5.0);
        do {
            lec.esperaYCierra("Introduce notas");
            try {
                nota1=lec.leeDouble("Nota parcial 1");
                nota2=lec.leeDouble("Nota parcial 2");
                notasCorrectas = true; // sale del bucle
            } catch (NumberFormatException e) {
                // no muestra mensaje de error porque ya
                // lo hace leeDouble
            }
        } while (!notasCorrectas);
    }
}
