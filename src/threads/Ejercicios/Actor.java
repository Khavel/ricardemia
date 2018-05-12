package threads.Ejercicios;

class Actor extends Thread {
    private Escenario mundo; //escenario en el que se mueve
    private Habitacion donde; //habitacion en la que esta
    private String nombre; //identificador
    public Actor (Escenario e, String nom){
        this.mundo = e;
        this.nombre = nom;
        this.situarEn(0);
    }

    public void situarEn (int h){
        this.donde = this.mundo.getHabitacion(h);
    }

    private void navegar() {
        try {
            sleep ((long) (Math.random() * 100.0));
        }
        catch (InterruptedException e) {}
    }

    public void run () {
        int pos;
        int veces = 0, cuantos;
        final int LIM = 3;
        while ( veces < LIM ) {
            this.donde.verHabitacion (nombre); //observar
            this.navegar(); //moverse
            cuantos = (int) (Math.random() * 10);
            for (int i=0; i<cuantos; i++)
                this.donde.retirar(nombre);
            this.navegar();
            cuantos = (int) (Math.random() * 3);
            for (int i=0; i<cuantos; i++) {
                pos = (int) (Math.random()*100.0);
                this.donde.colocar( new Cosa (pos, pos, pos), nombre );
            }
            System.out.println("fin ciclo de " + nombre);
            veces++;
        }
    }
}//fin Actor