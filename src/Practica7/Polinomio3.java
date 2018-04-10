package Practica7;

/**
 * Clase para manejar polinomios de tercer orden
 * 
 * @author (Jose I. Espeso) 
 * @version (30 abril 2014)
 */
public class Polinomio3 {

    private double a,b,c,d; //coeficientes del polinomio

    /**
     * Constructor al que se le pasan los coeficientes del polinomio
     */
    public Polinomio3(double a, double b, double c, double d) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    /**
     * Retorna el valor del polinomio en un 
     * punto x que se pasa como parametro
     */
    public double valor(double x) {
        return a*x*x*x+b*x*x+c*x+d;
    }
    
    /**
     * Retorna el valor de la derivada del polinomio 
     * en un punto x que se pasa como parámetro
     */
    public double derivada(double x) {
        return 3*a*x*x+2*b*x+c;
    }
    
}
