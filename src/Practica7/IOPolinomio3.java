/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */
package Practica7;

import fundamentos.*;
import javafx.scene.canvas.GraphicsContext;

public class IOPolinomio3 {

    /**
     *
     * @return
     */
    public static Polinomio3 lee(){
        Lectura l = new Lectura("Datos para el polinomio");
        l.creaEntrada("a",-0.4);
        l.creaEntrada("b",2.7);
        l.creaEntrada("c",-4.8);
        l.creaEntrada("d",1.3);
        l.esperaYCierra();
        double a,b,c,d;
        a=l.leeDouble("a");
        b=l.leeDouble("b");
        c=l.leeDouble("c");
        d=l.leeDouble("d");
        return new Polinomio3(a,b,c,d);
    }

    public static void dibuja(double x1, double x2, Polinomio3 p){
        Grafica g = new Grafica("Polinomio","Raiz","Valor");
        g.ponSimbolo(true);
        g.ponColor(Grafica.azul);
        g.ponTitulo("Polinomio");
        double step = (x2-x1)/100;
        while(x1<x2){
            g.inserta(x1,p.valor(x1));
            x1 += step; //x1 = x1 + step;
        }
        g.pinta();

    }
}
