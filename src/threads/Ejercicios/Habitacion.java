package threads.Ejercicios;

class Habitacion {
    private VectorCosas contenido; //contenedor de cosas
    private int numCosa; //para identificar las cosas
    public Habitacion (int n_cosas) {
        int pos;
        this.numCosa = 0;
        this.contenido = new VectorCosas();
        for (int i=0; i<n_cosas; i++) {
            pos = (int)( Math.random() * 100.0 );
            this.colocar ( new Cosa(pos, pos, pos), "" );
        }
    }
    public void colocar (Cosa c, String q){
        this.numCosa ++;
        c.putNombre (this.numCosa);
        this.contenido.guardar (c, q);
    }
    public void retirar (String q){
        this.contenido.extraer(q);
    }
    public void verHabitacion (String q) {
        this.contenido.mostrar(q);
    }
}//fin Habitacion
