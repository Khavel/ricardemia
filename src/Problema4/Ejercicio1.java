package Problema4;

import java.sql.SQLOutput;

public class Ejercicio1 {
    public static void main(String [] args){
        String s1,s2;
        s1 = "String1";
        s2 = "Palabra2";

        //Punto 1
        System.out.println(s1.length());
        System.out.println(s2.length());

        //2
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(1));
        System.out.println(s2.charAt(2));

        //3
        String s3;
        s3 = s1.substring(0,2) + s1.substring(4);

        //4
        boolean var;
        var = s1.contains(" ");

        //5
        boolean var2;
        String s1Aux = s1.substring(0,3);
        String s2Aux = s2.substring(0,3);
        var2 = s1Aux.contentEquals(s2Aux);

        /*
        Ejercicio 2
        */
        String codigo = "39618";
        System.out.println(zonaPostal(codigo));

        //Ejercicio 3


    }


    /*
    Ejercicio 2
     */
    public static String zonaPostal(String codigoPostal){
        char char1 = codigoPostal.charAt(0);
        char char2 = codigoPostal.charAt(1);

        if(char1 == '3' && char2 == '9'){
            return "Cantabria";
        }else{
            return "Otro";
        }
    }

    /*
    Ejerciocio 3
     */
    public static double convierte(char escala, double valor){
        switch (escala){
            case 'n':
                    return valor * 0.0000000001;

            case 'u':
                return valor * 0.000001;

            case 'm':
                return valor * 0.001;

            case 'k':
                return valor * 1000;

            case 'M':
                return valor * 1000000;

            case 'G':
                return valor * 1000000000;

            default:
                return -1;
        }

    }

    /**
     * Ejercicio 4
     */
    public static double funcion(double x, double n){
        double resultado = 0;
        double factorial = 1;
        double potencia = 1;
        for(int i=0;i<n;i++){
            factorial = factorial * i;
            potencia = potencia * x;
            resultado = ((i+1)/ factorial) * potencia;
        }
        return resultado;
    }
}
