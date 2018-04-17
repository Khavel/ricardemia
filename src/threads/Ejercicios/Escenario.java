package threads.Ejercicios;

class Escenario {
    private Habitacion [] elementos; //habitaciones del escenario
    private static final int n_cosas = 10; //num. cosas en la habitacion
    public Escenario (int num) {
        elementos = new Habitacion[num];
        for (int i=0; i< num; i++)
            elementos[i] = new Habitacion(n_cosas);
    }
    public Habitacion getHabitacion (int ind) {
        return elementos[ind];
    }
}