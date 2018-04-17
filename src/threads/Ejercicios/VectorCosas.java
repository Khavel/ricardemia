package threads.Ejercicios;

class VectorCosas {
    private static final int MAX = 100;
    private int tam;
    private Cosa[] lista;
    public VectorCosas () {
        lista = new Cosa [MAX];
        tam = 0;
    }
    public synchronized void mostrar (String quien) {
        int p = 0;
        System.out.println (quien + " ve (" + tam + "):" );
        for (int i=0; i<tam; i++)
            System.out.println(" " + quien + ", " + lista[i] );
    }
    public synchronized void guardar (Cosa c, String quien) {
        boolean encontrado = false;
        int p = 0;
        try {
            while (tam == MAX ) {//puedo almacenar?
                System.out.println (quien + " espera poder colocar Cosa.");
                wait();
            }
            System.out.println(quien + " coloca C" + c.toString());
            while ( (p < tam) && (! encontrado) ) {//almaceno ordenado
                if ( lista[p].mayorQue(c) ) encontrado = true;
                else p++;
            }
            if ( ! encontrado )
                lista[tam] = c;
            else {
                for (int i=tam-1; i>=p; i--)
                    lista[i+1] = lista [i];
                lista[p] = c;
            }
            tam++;
            notifyAll(); //ya esta, notifico.
        }
        catch (InterruptedException e) {}
    }
    public synchronized void extraer (String quien) {
        int eleccion = (int) ( Math.random() * tam );
        try {
//puedo extraer?
            while ( tam == 0 ) {
                System.out.println (quien + " espera poder eliminar Cosa.");
                wait();
            }
//elimino "eleccion"
            System.out.println(quien + " elimina C" + lista[eleccion].toString());
            for (int i=eleccion + 1; i<tam; i++)
                lista[i-1] = lista[i];
            tam--;
//ya esta, notifico.
            notifyAll();
        }
        catch (InterruptedException e) {}
    }
}//fin ListaCosas
