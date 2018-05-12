package Examenes.Septiembre2016;

import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 * Clase para almacenar cada puja de una subasta
 * 
 * @author Adolfo Garandal
 * @version 31-08-2016
 */
public class Puja
{
    private String usuario;
    private double precioOferta;
    private Calendar fechaPuja;

    /**
     * Constructor al que se le pasa el usuario y el precio de
     * oferta. Obtiene la fecha del reloj del sistema
     */
    public Puja(String usuario, double precioOferta)
    {
        this.usuario=usuario;
        this.precioOferta=precioOferta;
        fechaPuja = GregorianCalendar.getInstance();
    }

    /**
     * Retorna el usuario que hace la puja
     */
    public String usuario()
    {
        return usuario;
    }
    
    /**
     * Retorna el precio de la oferta
     */
    public double precioOferta()
    {
        return precioOferta;
    }
    
    /**
     * Retorna la fecha y hora a la que se hace la puja
     */
    public Calendar fechaPuja()
    {
        return fechaPuja;
    }
}
