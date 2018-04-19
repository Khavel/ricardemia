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
            Escritura e = new Escritura("Coeficientes");
            e.insertaValor("Coeficiente a",coef.coefA());
            e.insertaValor("Coeficiente b",coef.coefB());
            e.insertaValor("Coeficiente r",coef.correlacion());
            e.espera();

            estad.pintaRegresionLineal();

            Coeficientes coefLog = estad.regresionLogaritmica();
            Escritura eLog = new Escritura("Coeficientes");
            eLog.insertaValor("Coeficiente a",coefLog.coefA());
            eLog.insertaValor("Coeficiente b",coefLog.coefB());
            eLog.insertaValor("Coeficiente r",coefLog.correlacion());
            eLog.espera();

            estad.pintaRegresionLogaritmica();

            System.exit(0);
        }

    }


}
