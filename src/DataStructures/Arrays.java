/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package DataStructures;

import fundamentos.Lectura;

public class Arrays {

    public static void main(String []args){

        //Declaracion de array

        double[] listaDobles;
        //Inicializacion :
        listaDobles = new double[4]; //[0,0,0,0]

        //Otra forma
        double[] listaDobles2 = new double[4];

        //Otra mas
        Double listaDobles3[] = new Double[4];

        //Al inicializar los arrays, sus valores son 0 para numeros, false para booleanos y null para objetos.

        //Se accede a cada elemento usando su indice,
        //Acceso al segundo elemento del array:
        listaDobles[1] = 25.5; //[0,25.5,0,0]
        System.out.println(listaDobles[1]);
        //Tambien podemos acceder a una posicion del array usando variables enteras:
        int x = 1;
        System.out.println(listaDobles[x]);


        //Tambien podemos declarar un array e inicializarlo a una lista de literales, pero solo se puede en la declaracion:
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        //Los arrays tienen el atributo length, que nos dice el numero de elementos que tienen:

        System.out.println("Tamanho de diasmes " + diasMes.length);

        //Recorrido de arrays:
        for(int i=0;i<diasMes.length;i++){
            System.out.println("Dia " + i + " " + diasMes[i]);
        }

        //Recorrido de array usando bucle foreach:
        for(int dia:diasMes){
            System.out.println("Dias de foreach: " + dia);
        }

        //Calcular la media de los numeros en un array
        int media = 0;
        for(int i=0;i<diasMes.length;i++){
            media += diasMes[i];
        }
        media = media / diasMes.length;
        System.out.println(media);

        //Ejercicio: Calcular el maximo, minimo y la media de un array de enteros. Para ello, crear un array y rellenarlo usando la clase Lectura del paquete fundamentos.




        //Encontrar un alumno dado su dni
        System.out.println(buscarAlumno("123").getNombre());

        System.exit(0);



    }


    private static Alumno buscarAlumno(String dni){
        Lectura l = new Lectura("Alumnos");

        Alumno[] listaAlumnos = new Alumno[4];
        for(int i=0;i<listaAlumnos.length;i++){
            l.creaEntrada("nombre" + i,"");
            l.creaEntrada("dni" + i,"");
        }
        l.esperaYCierra();
        for(int i=0;i<listaAlumnos.length;i++){
            listaAlumnos[i] = new Alumno(l.leeString("nombre" +i),l.leeString("dni" + i));
        }

        for(Alumno al:listaAlumnos){
            System.out.println(al.getDni());
            if(al.getDni().equals(dni)){
                return al;
            }
        }
        return null;
    }
}
