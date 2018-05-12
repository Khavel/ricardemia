package Problema6;

import java.util.ArrayList;

public class Principal {
/*
    public static void main (String[] args){
        //Ejercicio 3
        Hogar h = new Hogar("electrodomesticos.txt");
        try{ //Como alguna las siguentes instrucciones pueden lanzar una excepcion, debemos escribirlas dentro de un bloque try
            h.listadoElectrodomesticos("Lavadora");//Esta instruccion puede lanzar una excepcion de tipo NoEncontrado
            h.listadoElectrodomesticos("Luces");//Lo mismo pasa con esta instruccion
            System.out.println(h.consumoAnualHogar());//Si no se lanza ninguna excepcion, se llega a esta instruccion, en el caso de que se lance alguna, no se ejecuta
        }catch(NoEncontrado e){ //Como las instrucciones del try pueden lanzar excepciones de tipo NoEncontrado, escribimos un bloque catch para este tipo de excepcion.
            System.out.println("Ha ocurrido un error!");//Dentro del bloque, tratamos la excepcion. En este caso, simplemente se muestra un mensaje de error y ya.
        }
        System.out.println(h.electrodomesticoDeMayorConsumo());//Esta instruccion, al estar fuera del catch, se ejecuta siempre, se produzcan o no excepciones.

    }

*/
    //Ejercicio 1
    public static ArrayList<Double> normalizar(ArrayList<Double> v){
        double max = 0.0;
        ArrayList<Double> resultado = new ArrayList<Double>();//Creamos un nuevo arrayList en el que guardaremos los resultados de la normalizacion.

        for(int i=0;i<=v.size()-1;i++){ //Recorremos el arrayList v, de la misma forma que recorreriamos un array.
            double valorAbs = Math.abs(v.get(i));
            if(valorAbs>max){ //En cada vuelta del bucle, comprobamos que el valor absoluto del numero en la posicion i-esima del arrayList es mayor que el valor de max. Si lo es, substituimos el valor de max por este.
                max = valorAbs;
            }
        }
        for(double x : v){//En este caso, recorremos el arrayList utilizando un bucle for each, el cual, en cada vuelta del bucle, hace que la variable x, que hemos declarado dentro de los parentesis del for, tome el valor de cada uno de los elementos del arrayList
            resultado.add(x/max); //Esto seria lo mismo que poner resultado.add(v.get(i)/max); en un bucle for normal. En el bucle for each, x = v.get(i), siendo i el contador del bucle
        }
        return resultado;
    }

    //Ejercicio 2
    public static ArrayList<String> ejer2(String[] lista){
        ArrayList<String> resultado = new ArrayList<>(); //Igual que antes, creamos un arrayList nuevo para almacenar el resultado del metodo
        for(int i=0;i<lista.length;i++){
            if(Character.isUpperCase(lista[i].charAt(0))){ //Como nos aconsejan en el enunciado, podemos usar el metodo estatico de la clase Caracter isUpperCase(). Este metodo nos devuelve true si el caracter pasado entre parentesis es mayuscula y false en caso contrario. Como el metodo es estatico, para llamarlo tenemos que poner el nombre de la clase, Caracter, seguido del nombre del metodo.
                resultado.add(lista[i]);    //Si el primer caracter del i-esimo string de la lista es mayuscula, lo guardo dentro del arrayList resultado.
            }
        }
        return resultado;
    }
/*
    //Ejercicio 4
    public static double ejer4(){

        try{ //Ponemos un bloque try, porque el metodo medida() puede lanzar excepciones.
            double medida = Experimento.medida();  //Aqui llamamos al metodo medida()
            return medida; //En caso de que el metodo medida lance excepcion, no se ejecuta esta instruccion. En caso de que no, se ejecuta y se retorna el resultado de medida()
        }catch(MedidaInestable e){ //Aqui tratamos la excepcion de tipo MedidaInestable, mostrando un mensaje de error y retornando 0.0, como se nos indica
            System.out.println("Ha ocurrido un error, medida inestable");
            return 0.0;
        }catch (MedidaErronea e){//Aqui tratamos la excepcion de tipo MedidaErronea, mostrando un mensaje de error y retornando Double.NaN (Not a Number), como se nos indica
            System.out.println("Ha ocurrido un error, medida erronea");
            return Double.NaN;
        }

    }

*/

}
