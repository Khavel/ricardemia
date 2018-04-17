/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Practica8;

import fundamentos.*;

public class DatosExperimento {
    public static void main(String[] args){
        Estadistica estad = new Estadistica(7);
        CajaTexto caja = new CajaTexto("Datos del experimento",7,2);
        caja.esperaYCierra();
        double num1, num2;
        boolean cabe = true;
        while (caja.hayMas() && cabe) {
            num1 = caja.leeDouble (0);
            num2 = caja.leeDouble (1);
            caja.avanzaLinea();
            cabe = estad.inserta(num1,num2);
            if(!cabe){
                System.out.println("Error, no caben mas datos");
                cabe = false;

            }
        }
        if(estad.numDatos()<=2){
            System.out.println("Error, muy pocos datos");
        }
        else{
            Coeficientes coef = estad.regresionLineal();
            System.out.println("Coeficiente a: " + coef.coefA());
            System.out.println("Coeficiente b: " + coef.coefB());
            System.out.println("Coeficiente r: " + coef.correlacion());
            System.exit(0);
        }

    }


}
