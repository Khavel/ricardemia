
/**
 * Clase que almacena la trayectoria de un avion, y 
 * dispone de metodos para representarla en Pantalla y para
 * analizarla.
 * 
 * @author (Tu nombre) 
 * @version (abr 2018)
 */
public class Trayectoria
{
    // poner aqui los atributos
    
    /**
     * Constructor que almacena el identificador del avion idAvion 
     * que se pasa como parametro. Crea un objeto de la clase 
     * Pantalla y lo guarda en el atributo ventana. Ademas, pone 
     * el atributo lista a valor null
     * 
     * @param  idAvion   el identificador del avion
     */
    public Trayectoria(int idAvion)
    {
	// hacer
    }

    /**
     * Muestra en la ventana todos los puntos de la trayectoria 
     * del avion, y finalmente el identificador del avion
     */
    public void muestraAvion()
    {
	// hacer
    }
    
    /**
     * Crea el array lista de tamano n. Luego va rellenando
     * este array hasta que el numero de datos anadidos sea n
     * 
     * @param  n   el numero de posiciones validas a recoger
     */
    public void recogePosiciones(int n) {
	// hacer
    }
    
    /**
     * Retorna un booleano indicando si alguno de los puntos
     * de la trayectoria pasa cerca del punto p o no. 
     * Se considera que pasa cerca si al menos uno de los
     * puntos de la trayectoria esta a una distancia de p
     * menor a dist
     * 
     * @param p    el punto sobre el que se comprueba 
     *             la cercania
     * @param dist distancia minima para considerar que
     *             la trayectoria esta cerca (Km)
     * @return booleano indicando si alguno de los puntos
     *                   de la trayectoria pasa cerca de p
     */
    public boolean pasaCerca(Posicion p, double dist) {
	// hacer
        return false;
    }
}
