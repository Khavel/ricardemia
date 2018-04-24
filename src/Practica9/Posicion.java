package Practica9;

/**
 * Almacena la latitud y longitud que definen las coordenadas en la
 * superficie de la tierra
 * 
 * @author (Michael) 
 * @version (Dic 2014)
 */
public class Posicion
{
    // latitud y longitud, en grados
    private double lat, lng;

    /**
     * Recibe la latitud y la longitud en grados y los copia en los atributos
     * 
     * @param lat la latitud en grados
     * @param lng la longitud  en grados
     */
    public Posicion(double lat, double lng)
    {
        this.lat=lat;
        this.lng=lng;
    }

    /**
     * Observador de la latitud; la devuelve en grados. 
     * La latitud aumenta de abajo a arriba en el mapa.
     *
     * @return la latitud en grados
     */
    public double lat()
    {
        return lat;
    }

    /**
     * Observador de la longitud; la devuelve en grados. 
     * La longitud aumenta de izquierda a derecha en el mapa
     *
     * @return la longitud en grados
     */
    public double lng()
    {
        return lng;
    }
    
    /**
     * Retorna las coordenadas convertidas a texto
     *
     * @return texto conteniendo las coordenadas en grados
     */
    public String toString() {
        return "{"+lat+","+lng+"}";
    }
    
    /**
     * Retorna la distancia entre la posicion actual y 
     * la indicada en el parametro
     * 
     * @param  pos   la posicion respecto a la cual 
     *               se calcula la distancia
     * @return  distancia en kilometros 
     */
    public double distancia(Posicion pos)
    {
        double lat1=Math.toRadians(this.lat);
        double lng1=Math.toRadians(this.lng);
        double lat2=Math.toRadians(pos.lat);
        double lng2=Math.toRadians(pos.lng);
        return Math.toDegrees(Math.acos(Math.sin(lat1)*Math.sin(lat2)+
         Math.cos(lat1)*Math.cos(lat2)*Math.cos(lng1-lng2)))*60.0*1.852;
    }

}
