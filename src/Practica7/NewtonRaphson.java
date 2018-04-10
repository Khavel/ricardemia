/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Practica7;

import fundamentos.Lectura;

public class NewtonRaphson {
    public static void main(String[] args){
        IOPolinomio3 iopol = new IOPolinomio3();
        Polinomio3 pol = iopol.lee();
        Lectura l = new Lectura("Datos para raphson");
        l.creaEntrada("x0",15.57);
        l.creaEntrada("Iteraciones",50);
        l.creaEntrada("Tolerancia",1.0e-6);
        l.esperaYCierra();
        double x0, iter, tol;
        x0 = l.leeDouble("x0");
        iter = l.leeDouble("Iteraciones");
        tol = l.leeDouble("Tolerancia");

        int cont = 0;
        double x1=100;
        while(Math.abs(pol.valor(x1))>=tol && cont<=iter+1){
            x1 = x0 - (pol.valor(x0)/pol.derivada(x0));
            x0 = x1;
            cont ++;
        }
        if(cont == iter+1){
            System.out.println("Error, demasiadas vueltas");
        }else {
            System.out.println("Raiz: " + x0);
            System.out.println("Valor del polinomio: " + pol.valor(x0));
            System.out.println("Numero de iteraciones: " + cont);
        }
        double raiz = x0;
        double lambda = Math.max(0.1,Math.abs(0.1*raiz));
        double ex1 = raiz - lambda;
        double ex2 = raiz + lambda;
        iopol.dibuja(ex1,ex2,pol);

        System.exit(0);
    }

}
