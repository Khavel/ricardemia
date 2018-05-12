import java.io.*;
import java.util.ArrayList;
/**
 * Contiene una lista con el conjunto de subastas publicadas en el
 * sitio de subastas y metodos para su gestion.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasaSubastas
{
    // lista de subastas publicadas
    private ArrayList<Subasta> subastasPublicadas;

    // metodo privado que retorna una lista con las subastas publicadas
    private ArrayList<Subasta> cargaDatos()
    {
        
        ArrayList<Subasta> ret = new ArrayList<Subasta>();
       
        try
        {
            Subasta s=new Subasta("Adolfo","ordenador",100, 2017,0,1,12,0);
            s.pujar(new Puja("Luis",110));
            s.pujar(new Puja("Mario",120));
            ret.add(s);
            
            s=new Subasta("Adolfo","teclado",20, 2017,0,1,12,0);
            s.pujar(new Puja("Luis",23.20));
            s.setFechaFin(2016,8,1,12,0);
            ret.add(s);
            
            ret.add(new Subasta("Antonio","camiseta",20, 2016,10,5,15,30));
            
            s=new Subasta("Ricardo","cargador",15, 2016,10,18,8,0);
            s.pujar(new Puja("Luis",17));
            s.pujar(new Puja("Mario",19));
            s.pujar(new Puja("Adolfo",29));
            s.pujar(new Puja("Mario",35.20));
            ret.add(s);
            
            s=new Subasta("Ricardo","smartphone",200, 2017,0,1,12,0);
            s.pujar(new Puja("Luis",215));
            s.pujar(new Puja("Pablo",250));
            s.setFechaFin(2016,7,28,12,0);
            ret.add(s);
            
            s=new Subasta("Mario","ipad",325, 2016,6,1,20,15);
            ret.add(s);
            
            s=new Subasta("Adolfo","monitor",65, 2016,9,14,12,0);
            s.pujar(new Puja("Luis",68.75));
            ret.add(s);
        }catch( PujaInvalida e)
        {
            System.out.println("Error en la carga de pujas. ");
        }
        
        
        return ret;
    }
    
    /**
     * Constructor que llama al metodo privado cargaDatos
     * y asigna la lista que retorna a la lista de subastas publicadas
     */
    public CasaSubastas()
    {
        //A hacer por el alumno
    }

    /**
     * Este metodo anyade una nueva subasta a la lista de subastas
     * publicadas. La subasta que se desea anyadir se recibe como
     * parametro. Se retorna el identificador de la subasta
     */
    public int registrarSubasta(Subasta s)
    {
        //A hacer por el alumno
        return -1;
    }
    
    /**
     * Este metodo invoca al metodo cerrar de todas las subastas, para
     * que se cierren todas las que lo requieran
     */
    public void cerrarSubastas()
    {
        //A hacer por el alumno
        
    }
    
    /**
     * metodo que busca una subasta dentro de la lista de subastas
     * publicadas a partir del codigo de identificacion que recibe en
     * el primer parametro. Si se encuentra y la puja que se recibe
     * como segundo parametro es valida, se registra esta puja. Si la
     * puja no es valida, se lanzara la excepcion PujaInvalida. Si no
     * se encuentra la subasta, se lanzara la excepcion
     * SubastaIncorrecta
     */
    public void pujar(int idSubasta, Puja puja) 
	throws SubastaIncorrecta, PujaInvalida
    {
        //A hacer por el alumno        
    
    }
    
    /**
     * Este metodo escribe un fichero de texto, cuyo nombre se recibe
     * como parametro, con un resumen de la actividad de la casa de
     * subastas. Tiene dos partes. En la primera parte se escribira en
     * el fichero la lista de las subastas abiertas en ese momento,
     * con su correspondiente puja lider (si no hubiese pujas, se
     * escribira un guion). en la segunda parte se escribira en el
     * fichero un resumen economico con el número de subastas
     * cerradas, el número de subastas desiertas (sin pujas) y el
     * total recaudado
     */
    public void resumenActividad(String fich)
    {
        
        //A hacer por el alumno

    }
    
}
