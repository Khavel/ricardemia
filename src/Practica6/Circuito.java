package Practica6;

public class Circuito {
    private double c,r,ve;

    public Circuito(double c, double r, double ve){
        this.c = c;
        this.r = r;
        this.ve = ve;
    }

    public double tensionCondensador(double t, double t0){
        double vc;
        if(t <= t0){
            vc = ve * (1 - Math.exp(-t/(r*c)));
        }else{
            vc = tensionCondensador(t0,t0) * (Math.exp(-1 * (t-t0) / (r*c)));
        }
        return vc;
    }
}
