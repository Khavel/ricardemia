package threads.Ejercicios;

class Cosa {
    private int x, y, z; //posicion 3D
    private int nom; //identificador de cada objeto
    public Cosa () {
        this (0, 0, 0);
    }
    public Cosa (int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public void putNombre (int n) {
        this.nom = n;
    }
    public boolean mayorQue ( Cosa c ){
        boolean mayor = false;
        if ( this.x > c.x ) mayor = true;
        else if ( this.y > c.y ) mayor = true;
        else if ( this.z > c.z ) mayor = true;
        return mayor;
    }
    public String toString () {
        String str;
        str = "C" + this.nom + " (" + this.x + ", " + this.y + ", "
                + this.z + ")";
        return str;
    }
}//fin Cosa
