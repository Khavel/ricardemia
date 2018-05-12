import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;
/**
 * Clase que almacena los datos de una subasta con una lista del historico 
 * de pujas realizadas
 * 
 * @author Adolfo Garandal
 * @version 31-08-2016
 */
public class Subasta
{
    private int id;
    private String usuario;
    private String producto;
    private double precioSalida;
    private Calendar fechaFin;
    private boolean cerrada;
    private ArrayList<Puja> listaPujas;

    // identificador a asignar a la proxima subasta
    private static int genId = 1; 
    

    /**
     * Constructor al que se le pasan los datos de la subasta: usuario, 
     * descripcion del producto y fecha de fin descrita con su anyo, mes, 
     * dia, hora y minutos
     * Deja la lista de pujas vacia y la subasta abierta
     * Ademas asigna el identificador automaticamente
     */
    public Subasta(String usuario, String producto, double precioSalida, 
		   int anyoFin, int mesFin, int diaFin, 
		   int horaFin, int minFin)
    {
       this.usuario=usuario;
       this.producto=producto;
       this.precioSalida=precioSalida;
       fechaFin = GregorianCalendar.getInstance();
       fechaFin.set(anyoFin,mesFin,diaFin,horaFin,minFin);
       this.cerrada=false;
       listaPujas=new ArrayList<Puja>();
       id=genId;
       genId++;
    }
    
    /**
     * Observador del id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Observador del usuario que hace la subasta
     */
    public String getUsuario()
    {
        return usuario;
    }

    /**
     * Observador de la descripcion del producto
     */
    public String getProducto()
    {
        return producto;
    }
    
    /**
     * Observador del precio de salida
     */
    public double getPrecioSalida()
    {
        return precioSalida;
    }

    /**
     * Metdodo para actualizar la fecha de fin de la subasta
     */
    public void setFechaFin(int anyoFin, int mesFin, int diaFin, 
			    int horaFin, int minFin)
    {
          fechaFin.set(anyoFin,mesFin,diaFin,horaFin,minFin);
    }

    
    /**
     * Metodo que registra una puja, siempre que la subasta este
     * abierta y la puja sea valida
     * 
     * @param  puja: la puja que se quiere registrar
     * @return     verdadero si la puja se registra, falso en caso contrario
     */
    public void pujar(Puja puja) throws PujaInvalida
    {
        //Que el usuario de la subasta no sea el mismo que hace la puja.
        if(usuario.equals(puja.usuario()))
            throw new PujaInvalida("Usuario invalido.");
        
        //Que la fecha de la puja sea anterior a la fecha de
        //finalizacion de la subasta.
        if(puja.fechaPuja().after(fechaFin))
        {
            cerrada = true;
            throw new PujaInvalida("Subasta cerrada.");
        }
        
        //Que el precio ofertado en la puja sea mayor que el precio de
        //la puja mas alta. En caso de que no haya aun pujas, el
        //precio de la oferta debe ser mayor que el precio base de la
        //puja.
        if(listaPujas.size()==0)
        {
            if(puja.precioOferta()< precioSalida)
                throw new PujaInvalida("Puja menor que el precio de salida.");
            else
            {
                //inserto al principio
                listaPujas.add(0, puja);
                return;
            }
        }
        else
        {
            if(puja.precioOferta() <= listaPujas.get(0).precioOferta())
                throw new PujaInvalida
		    ("La puja no supera la mayor puja regsitrada.");
            else
            {
                //inserto al principio
                listaPujas.add(0, puja);
                return;
            }
        }
        
    }
    
    /**
     * Retorna la puja lider, o null si no hay ninguna puja
     */
    public Puja pujaLider()
    {
        if(listaPujas.size()==0)
            return null;
        
        return listaPujas.get(0);
    }
    
    /**
     * Indica si la subasta esta cerrada (true) o abierta (false)
     */
    public boolean estaCerrada()
    {
        return cerrada;
    }
    
    /**
     * Cierra la subasta si la fecha actual es posterior a la fecha de
     * finalizacion Si no, no hace nada
     */
    public void cerrar()
    {
        if(Calendar.getInstance().after(fechaFin))
        {
            cerrada = true;
        }
        
    }
}
