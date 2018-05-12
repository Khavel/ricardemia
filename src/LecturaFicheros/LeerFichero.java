package LecturaFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class LeerFichero {

    public  static void main(String[] args){
        //leerFich("Alumnos");
        final String nomFich="datos.txt";
        try (Scanner in= new Scanner(new FileReader(nomFich))) { // configura el formato de números
            in.useLocale(Locale.ENGLISH); //En este formato, los decimales de los numeros se separan con punto en lugar de coma
            // lee el fichero palabra a palabra
            while (in.hasNext()) { // lee primera palabra y la escribe
                String palabra = in.next(); //el comando next() retorna el siguiente string del fichero y mueve el puntero de lectura a la derecha
                System.out.println("Palabra:"+palabra);
                // lee números
                while (in.hasNextDouble()) {
                    // lee un double
                    double d = in.nextDouble();
                    System.out.println("Número:"+d); } } // fin while (in.hasNext())
         } catch (FileNotFoundException e) {
        System.out.println("Error abriendo " + nomFich); }
        leerFich("datos.txt");
    }

    //Este metodo lee un fichero linea a linea,sin formato
    public static void leerFich(String nomFich){
        try (Scanner in= new Scanner(new FileReader(nomFich))) {
            // lee el fichero línea a línea
            while (in.hasNextLine()) {
                // lee la siguiente línea y la muestra
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo " + nomFich);
        }
    }


}
