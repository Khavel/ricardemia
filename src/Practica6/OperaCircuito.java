package Practica6;
import fundamentos.*;

public class OperaCircuito {

    public static void main(String[] args){
        Lectura l = new Lectura("Escriba los datos y el instante t0:");
        l.creaEntrada("C:",0.0);
        l.creaEntrada("R:",0.0);
        l.creaEntrada("V:",0.0);
        l.creaEntrada("t0:",0.0);
        l.esperaYCierra();
        double c,r,v,t0;
        c = l.leeDouble("C:");
        r = l.leeDouble("R:");
        v = l.leeDouble("V:");
        t0 = l.leeDouble("t0:");

        Circuito cir = new Circuito(c,r,v);
        double t1,t2,t3,t4;
        t1 = cir.tensionCondensador(0.000,t0);
        t2 = cir.tensionCondensador(0.001,t0);
        t3 = cir.tensionCondensador(0.002,t0);
        t4 = cir.tensionCondensador(0.01,t0);

        Escritura e = new Escritura("Tension del condensador");
        e.insertaValor("Tension 1",t1);
        e.insertaValor("Tension 2",t2);
        e.insertaValor("Tension 3",t3);
        e.insertaValor("Tension 4",t4);
        e.espera();



        Grafica g = new Grafica ("Condensadores","Tiempo(ms)","Tension(v)");
        double x;



        g.ponSimbolo(true);
        g.ponColor(Grafica.azul);
        g.ponTitulo("Tension condensador");
        for (int i=0; i<=200; i++) {
            x = i/10.0;
            g.inserta(x,cir.tensionCondensador(x/1000,t0));
        }

        g.pinta();

        System.exit(0);

    }
}
