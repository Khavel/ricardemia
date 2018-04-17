/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Practica8;

public class Coeficientes {
    private double a,b,r;

    public Coeficientes(double a, double b, double r){
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public double coefA(){
        return a;
    }

    public double coefB(){
        return b;
    }

    public double correlacion(){
        return r;
    }


}
