package Practica7;

import fundamentos.Lectura;

public class Biseccion {

    public static void main(String [] args){
        IOPolinomio3 iopol = new IOPolinomio3();
        Polinomio3 pol = iopol.lee();

        Lectura l = new Lectura("Datos para raphson");
        l.creaEntrada("a",0);
        l.creaEntrada("b",0);
        l.creaEntrada("Tolerancia",0.5);
        l.esperaYCierra();
        double a, b, tol;
        a = l.leeDouble("a");
        b = l.leeDouble("b");
        tol = l.leeDouble("Tolerancia");

        if (pol.valor(a) > 0 && pol.valor(b) > 0)
            System.out.println("Error, las raices tienen el mismo signo, no se hace biseccion");
        else if (pol.valor(a) < 0 && pol.valor(b) < 0)
            System.out.println("Error, las raices tienen el mismo signo, no se hace biseccion");
        else{
            double c,fa,fb,fc;
            int cont = 0;
            c = (a + b)/2;
            while(Math.abs(pol.valor(c)) >= tol){
                fa = pol.valor(a);
                fb = pol.valor(b);
                fc = pol.valor(c);

                if (fc * fa < 0) {
                    b = c;
                    fa = pol.valor(a);
                    fb = pol.valor(b);
                    c = (a + b) / 2;
                    fc = pol.valor(c);
                } else {
                    a = c;
                    fa = pol.valor(a);
                    fb = pol.valor(b);
                    c = (a + b) / 2;
                    fc = pol.valor(c);
                }
                cont ++;

            }

            System.out.println("Raiz: " + c);
            System.out.println("Valor del polinomio en la raiz: " + pol.valor(c));
            System.out.println("Iteraciones: " + cont);

            double raiz = c;
            double lambda = Math.max(0.1,Math.abs(0.1*raiz));
            double ex1 = raiz - lambda;
            double ex2 = raiz + lambda;
            iopol.dibuja(ex1,ex2,pol);

        }

        System.exit(0);
    }
}
