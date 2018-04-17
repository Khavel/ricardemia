/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Practica8;

public class Estadistica {

    private double[] x;
    private double[] y;
    private int num;

    public Estadistica(int maxDatos){
        x = new double[maxDatos];
        y = new double[maxDatos];
    }

    public boolean inserta(double x, double y){
        if(num == this.x.length){
            return false;
        }else{
            this.x[num] = x;
            this.y[num] = y;
            num = num + 1;
            return true;
        }
    }

    public int numDatos(){
        return num;
    }

    private double funcion(){
        double yAux=0;
        double xAux = 1/(x[num-1]-this.x[0]);
        for(int i=0;i<num-1;i++){
            yAux += ((y[i+1] + y[i])/2)*(x[i+1]-x[i]);
        }
        return xAux*yAux;
    }

    public double media(){
        return funcion()/num;
    }

    public void pintaRegresionLineal(){

    }

    public Coeficientes regresionLineal(){
        double sumX=0;
        double sumY = 0;
        double sumX2 = 0;
        double sumY2 = 0;
        double sumXY = 0;

        if(num <= 2){
            return null;
        }

        for(int i=0;i<num;i++){
            sumX = sumX + x[i];
            sumY = sumY + y[i];
            sumX2 = sumX2 + (x[i]*x[i]);
            sumY2 = sumY2 + (y[i]*y[i]);
            sumXY = sumXY + (x[i]*y[i]);
        }
        double a = ((num*sumXY)-(sumX*sumY))/((num*sumX2)-(sumX*sumX));
        double b = (sumY-(a*sumX))/num;
        double r = ((num*sumXY)-(sumX-sumY))/(Math.sqrt(((num*sumX2)-(sumX*sumX))*(num*sumY2-(sumY*sumY))));
        return new Coeficientes(a,b,r);
    }


}
