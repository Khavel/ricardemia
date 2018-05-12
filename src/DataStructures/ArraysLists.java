package DataStructures;

import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args){
        //A diferencia de los arrays, que tienen un tamaño fijo, los arrayLists tienen tamaño variable, lo que significa que su tamaño aumentara o disminuira segun metamos o saquemos elementos
        //Se crean de la siguiente manera:
        ArrayList<Double> lista = new ArrayList<Double>();
        double[] listaArray;
        listaArray = new double[10];
        //Meter elementos al final de la lista:
        lista.add(10.0);
        lista.add(20.0);
        lista.add(30.0);

        //Leer elementos:
        System.out.println(lista.get(0));
        System.out.println(lista.get(2));

        //Si leo un elemento en una posicion vacia, salta error:
        //System.out.println(lista.get(10));

        //En los arrayLists tambien podemos borrar elementos si conocemos su indice:
        lista.remove(1);

        //Al eliminar un elemento, el resto de elementos de la lista se reordenan

        //Como los arrays, tambien podemos saber el numero de elementos que contiene la lista:
        System.out.println(lista.size());

        //Tambien podemos añadir elementos en posiciones especificas:
        lista.set(1,40.0);

        //Podemos recorrerlos de la misma forma que los arrays:
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        //O bien con un bucle foreach:
        for(double d:lista){
            System.out.println(d);
        }


        //Ejercicio: Usar la clase Lectura del paquete fundamentos para leer del teclado una
        // serie de numero con decimales y guardarlos dentro de un arrayList.
        // Despues mostrar por pantalla el maximo, el minimo y la media de estos numeros, y
        // ademas decir si el numero 7.0 esta o no en la lista.

    }



}
