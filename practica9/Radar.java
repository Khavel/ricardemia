
/**
 * Es la implementacion informatica de un sistema de radar.
 * 
 * @author (Michael) 
 * @version (Dic 1014)
 */
public class Radar
{
    // Se ofrece una simulacion que retorna datos sinteticos	

    // latitud (y) y longitud (x), en grados
    private static int y=450, x=50;
    // incrementos de latitud y longitud a cada paso, en grados
    private static int deltaX=2, deltaY=-3;

    /**
     * Retorna la posicion actual del avion identificado por idAvion. 
     * Si el radar no logra encontrar el avion, retorna null
     *
     * @param idAvion el identificador del avion cuya posicion se desea
     * @return la posicion del avion, o null si no se ha encontrado
     */
    public static Posicion leePosicionActual(int idAvion)
    {
        // Al exceder los limites del dibujo vamos en direccion contraria
        if (x>450 || x<50) {
            deltaX=-deltaX;
        }
        if (y>450 || y<50) {
            deltaY=-deltaY;
        }
        x+=deltaX;
        y+=deltaY;
        // Simulamos un fallo de radar 
        if (Math.random()<0.01) {
            // fallo de radar
            return null; 
        } else {
            // retornamos la posicion correcta
            return new Posicion(y,x);
        }
    }
}
