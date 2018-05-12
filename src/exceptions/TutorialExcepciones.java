package exceptions;

import fundamentos.Lectura;

public class TutorialExcepciones {
    public static void main(String[] args){
        excepcionAritmetica();
    }




    public static void excepcionAritmetica(){
        try{//Escribimos try y dentro de sus llaves escribimos cualquier instruccion que pueda lanzar una excepcion.
            int x = 10/0;
        }catch (ArithmeticException e){ //Dentro de los parentesis del catch, ponemos el tipo de excepcion que se puede lanzar y hacemos el tratamiento. Tambien podriamos cambiar arithmeticException por Exception, de forma que tratariamos cualquier excepcion, pero seria menos especifico.
            System.out.println("Division por 0");
        }finally{ //El bloque finally se ejecuta SIEMPRE tras el try-catch, independientemente de que se produzcan o no excepciones. Esta clausula es opcional.
            System.out.println("Este mensaje sale siempre por pantalla.");
        }

    }

    public static void tiposExcepciones(){
        //Excepcion leve:
        try{
            int x = 10/0;
        }catch (ArithmeticException e){ //Se informa al usuario con un mensaje de error de la excepcion producida, y se continua con el programa normalmente.
            System.out.println("Error leve");
        }

        //Excepcion grave
        try {
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error grave");
            System.exit(-1); // finaliza la aplicación, tambien se puede finalizar solo el metodo, con return, o lanzar la excepcion, con throw
        }

        //Excepcion recuperable:
        double nota1, nota2;
        boolean notasCorrectas = false;
        Lectura lec = new Lectura("Lee notas");
        lec.creaEntrada("Nota parcial 1",5.0);
        lec.creaEntrada("Nota parcial 2",5.0); do {
            lec.esperaYCierra("Introduce notas");
            try { //Se intenta realizar una accion, en este caso leer dos numeros. Si los datos introducidos son numeros, el programa se ejecuta normalmente, si son otra cosa , se lanza una excepcion.
                nota1=lec.leeDouble("Nota parcial 1");
                nota2=lec.leeDouble("Nota parcial 2");
                notasCorrectas = true; // sale del bucle
            } catch (NumberFormatException e) { //Como se ha lanzado una excepcion, no se ha cambiado a true el valor de notasCorrectas, por lo tanto el bucle while se ejecuta de nuevo, volviendo a leer los datos, hasta que sean correctos
                // no muestra mensaje de error porque ya
                // lo hace leeDouble
            }
        } while (!notasCorrectas);
    }

    public static void lanzarExcepciones() throws RuntimeException,NullPointerException{ //Con trhows indicamos que este metodo lanza una excepcion del tipo especificado, en este caso RuntimeException.Un mismo metodo puede lanzar mas de una excepcion diferente.
        throw new RuntimeException("Mensaje de error");//Para lanzar la excepcion, debemos usar el comando throw y crear un nuevo objeto Exception del tipo que necesitemos. Ademas, podemos pasarle un string al constructor de Exception, que sera el mensaje de error de la excepcion.
    }

    public class ExcepcionCreada extends Exception{ //De esta manera, en una clase a parte o dentro de otra clase, podemos crear nuestras propias excepciones.

    }
}
