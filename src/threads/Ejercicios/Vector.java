package threads.Ejercicios;

class Vector extends Thread {
    private int[] datos;
    private String nombre;
    private int tam;
    private int suma;
    private long sumaSqr;
    private double media;
    Vector (int t, String n) {
        this.nombre = n;
        this.tam = t;
        this.suma = 0;
        this.sumaSqr = 0;
        this.media = 0.0;
        this.datos = new int [ this.tam ];
        for (int i=0; i < this.tam; i++) {
            datos[i] = (int) (Math.random () * 100.0);
        }
    }
    public int suma () {
        return (this.suma);
    }
    public long sumaSqr () {
        return (this.sumaSqr);
    }
    public double media () {
        return (this.media);
    }
    public void run () {
        for (int i=0; i< this.tam; i++) {
            System.out.println ( this.nombre + ": " + i );
            this.suma += datos[i];
            this.sumaSqr += datos[i] * datos[i];
        }
        this.media = (double) this.suma / (double) this.tam;
    }
} //fin clase Vector
