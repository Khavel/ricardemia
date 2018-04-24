package Practica9;

import javafx.geometry.Pos;

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
    private Posicion[] lista;
    private int idAvion;
    private Pantalla ventana;
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
        this.idAvion=idAvion;
        ventana = new Pantalla();
        lista = null;
    }

    /**
     * Muestra en la ventana todos los puntos de la trayectoria 
     * del avion, y finalmente el identificador del avion
     */
    public void muestraAvion()
    {
	    for(int i=0;i<lista.length;i++){
	        ventana.pintaPuntoTry(lista[i]);
        }
        ventana.pintaAvion(idAvion,lista[lista.length-1]);
    }
    
    /**
     * Crea el array lista de tamano n. Luego va rellenando
     * este array hasta que el numero de datos anadidos sea n
     * 
     * @param  n   el numero de posiciones validas a recoger
     */
    public void recogePosiciones(int n) {
        lista = new Posicion[n];
        int anhadidos = 0;
        while(anhadidos < n){
            Posicion p = Radar.leePosicionActual(idAvion);
            if (p == null){
                ventana.muestraAlarma("Fallo en el radar!");

            }else{
                lista[anhadidos] = p;
                anhadidos++;
            }
        }
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
        boolean cerca = false;
        for(int i=0;i<lista.length;i++){
            if(lista[i].distancia(p) < dist){
                cerca = true;
            }
        }
        return cerca;
    }

    public Posicion[] estanDentroRect(Posicion esquinaSupDcha,Posicion esquinaInfIzq){
        double latSup,latInf;
        double lonDer,lonIzq;

        latSup = esquinaSupDcha.lat();
        latInf = esquinaInfIzq.lat();
        lonDer = esquinaSupDcha.lng();
        lonIzq = esquinaInfIzq.lng();

        int nPos = 0;
        for(int i=0;i<lista.length;i++){
            if(lista[i].lat() <= latSup && lista[i].lat() >= latInf){
                if(lista[i].lng() <= lonDer && lista[i].lng() >= lonIzq){
                    nPos++;
                }
            }
        }

        Posicion[] listaEstan = new Posicion[nPos];
        for(int i=0;i<nPos;i++){
            if(lista[i].lat() <= latSup && lista[i].lat() >= latInf){
                if(lista[i].lng() <= lonDer && lista[i].lng() >= lonIzq){
                    listaEstan[i] = lista[i];
                }
            }
        }
        return listaEstan;
    }
}
