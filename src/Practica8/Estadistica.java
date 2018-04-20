/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package Practica8;

import fundamentos.*;

public class Estadistica {

    private double[] x;
    private double[] y;
    private int num;

    public Estadistica(int maxDatos){
        x = new double[maxDatos];
        y = new double[maxDatos];
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
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

    /**
     *
     * @return
     */
    public Coeficientes regresionLogaritmica(){
        double a, b, r;
        double sumLnX=0;
        double sumLnXY = 0;
        double sumLnX2 = 0;
        double mediaY = 0;
        double mediaXLn;
        double sumY = 0;
        double sumY2 = 0;
        for (int i=0;i<num;i++){
            sumLnX = sumLnX + Math.log(x[i]);
            sumLnXY += Math.log(x[i]) * y[i];
            sumLnX2 += Math.log(x[i]) * Math.log(x[i]);
            sumY += y[i];
            sumY2 = sumY2 + (y[i] * y[i]);

        }
        mediaY = sumY/num;
        mediaXLn = sumLnX/num;
        a = (sumLnXY-(mediaY*sumLnX))/(sumLnX2-(mediaXLn*sumLnX));
        b = mediaY - (a * mediaXLn);
        r= (num*sumLnXY - sumLnX*sumY)/(Math.sqrt((num*sumLnX2 - sumLnX*sumLnX)*(num*sumY2-(sumY*sumY))));

        return new Coeficientes(a,b,r);
    }

    /**
     *
     * @return
     */
    public double media(){
        double yAux=0;
        double xAux = 1/(x[num-1]-this.x[0]);
        for(int i=0;i<num-1;i++){
            yAux += ((y[i+1] + y[i])/2)*(x[i+1]-x[i]);
        }
        return (xAux*yAux)/num;
    }

    /**
     *
     */
    public void pintaRegresionLineal(){
        Coeficientes rl=regresionLineal();
        if (rl==null) {
            Mensaje m=new Mensaje();
            m.escribe("Error: no hay suficientes puntos en la regresion");
        } else {
            // Calcular el maximo y minimo de las x
            double xMin=Double.MAX_VALUE;
            double xMax=-Double.MAX_VALUE;
            for (int i=0; i<num; i++) {
                if (x[i]<xMin) {
                    xMin=x[i];
                }
                if (x[i]>xMax) {
                    xMax=x[i];
                }
            }

            // Crear la grafica
            Grafica graf = new Grafica("Recta de regresion","X","Y");
            // Valores para la grafica de los puntos
            graf.ponColor(Grafica.azul);
            graf.ponSimbolo(true);
            graf.ponLineas(false);
            graf.ponTitulo("Puntos");
            for (int i=0; i<num; i++) {
                graf.inserta(x[i],y[i]);
            }
            graf.otraGrafica();

            // Pinta la recta de regresion
            double a=rl.coefA();
            double b=rl.coefB();
            graf.ponColor(Grafica.rojo);
            graf.ponSimbolo(false);
            graf.ponLineas(true);
            graf.ponTitulo("Recta");
            graf.inserta(xMin,a*xMin+b);
            graf.inserta(xMax,a*xMax+b);

            graf.pinta();
        }

    }

    public void pintaRegresionLogaritmica(){
        Coeficientes rl=regresionLogaritmica();
        if (rl==null) {
            Mensaje m=new Mensaje();
            m.escribe("Error: no hay suficientes puntos en la regresion");
        } else {
            // Crear la grafica
            Grafica graf = new Grafica("Curva de regresion","X","Y");
            // Valores para la grafica de los puntos
            graf.ponColor(Grafica.azul);
            graf.ponSimbolo(true);
            graf.ponLineas(false);
            graf.ponTitulo("Puntos");
            for (int i=0; i<num; i++) {
                graf.inserta(x[i],y[i]);
            }
            graf.otraGrafica();

            // Pinta la curva de regresion
            double a=rl.coefA();
            double b=rl.coefB();
            graf.ponColor(Grafica.rojo);
            graf.ponSimbolo(false);
            graf.ponLineas(true);
            graf.ponTitulo("Logaritmica");
            for(int i=0;i<num;i++){
                graf.inserta(x[i],a*Math.log(x[i])+b);
            }

            graf.pinta();
        }

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
        double r = ((num*sumXY)-(sumX*sumY))/(Math.sqrt(((num*sumX2)-(sumX*sumX))*(num*sumY2-(sumY*sumY))));
        return new Coeficientes(a,b,r);
    }


}
