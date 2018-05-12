/**
 * Ventana donde representar informacion sobre trayectorias de aviones.
 * 
 * @author (Michael) 
 * @version (Dic 2014)
 */
public class Pantalla
{
    
    private Dibujo2 dib;
    private double anteriorX=50, anteriorY=50;
    private double angulo=0.0;
    private int numErrores=0;

    /**
     * Constructor que crea una ventana para mostrar informacion de trayectoria
     */
    public Pantalla()
    {
        dib = new Dibujo2("Control de trafico aereo", 500, 500);
        dib.ponGrosorLapiz(5);
        dib.ponColorLapiz(ColorFig2.azul);
    }

    /**
     * Pinta en la ventana un punto de la trayectoria que ha seguido un avion, 
     * cuya posicion es p. 
     * Llamando muchas veces a este procedimiento con diferentes posiciones, 
     * se puede conseguir que aparezca en pantalla una trayectoria completa
     * 
     * @param  p un punto de la trayectoria, para ser pintado
     */
    public void pintaPuntoTry(Posicion p)
    {
        dib.dibujaPunto((int)p.lng(), 500- (int) p.lat());
        dib.pinta();
        // calcula el angulo de la trayectoria
        angulo=Math.atan2(500-p.lat()-anteriorY, p.lng()-anteriorX);
        anteriorX=p.lng();
        anteriorY=500-p.lat();
        espera(30);
    }
    
    /**
     *  Espera un tiempo especificado en milisegundos
     *
     * @param milis el tiempo de espera en milisegundos
     */
    private void espera(int milis) {
        try{
            Thread.sleep(milis); 
        } catch (Exception e) {

        }
    }

    
    /**
     * Muestra en la ventana la posicion actual del avion (especificada por p), 
     * junto a su identificador (especificado por idAvion)
     * 
     * @param idAvion el identificador del avion
     * @param p la posicion del avion
     */
    public void pintaAvion(int idAvion, Posicion p) {
        dib.dibujaImagen((int)p.lng(), 500-(int)p.lat(), "avion.png",
                         (int) Math.toDegrees(angulo) + 90);
        dib.ponColorLapiz(ColorFig2.rojo.masOscuro());
        dib.dibujaTexto(""+idAvion,(int)p.lng()+20, 500-(int)p.lat());
        dib.ponColorLapiz(ColorFig2.azul);
        dib.pinta();
    }
    
    /**
     * Muestra en pantalla el mensaje de alarma especificado por mensaje
     *
     * @param mensaje el mensaje a mostrar en pantalla
     */
    public void muestraAlarma(String mensaje) {
        numErrores++;
        dib.ponColorLapiz(ColorFig2.rojo.masOscuro());
        dib.dibujaTexto("Error "+numErrores+". "+mensaje,30, 15);
        dib.ponColorLapiz(ColorFig2.azul);        
    }
}
