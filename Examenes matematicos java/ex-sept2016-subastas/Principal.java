/**
 * Clase que contiene un programa de prueba de la clase CasaSubastas
 * 
 * @author (Adolfo Garandal) 
 * @version (Sept 2016)
 */
public class Principal
{
    public static void main(String[] args)
    {
        CasaSubastas cs=new CasaSubastas();
        cs.resumenActividad("resInicial.txt");
        
        Subasta s=new Subasta("Luis","canoa",125, 2016,11,17,15,0);
        cs.registrarSubasta(s);
        
        try { 
            cs.pujar(1,new Puja("Luis",125)); 
        } catch(SubastaIncorrecta e) {
            System.out.println
		("ERROR, la subasta debe existir."+e.getMessage());
        } catch(PujaInvalida e)  {
            System.out.println
		("ERROR, la puja debe ser correcta."+e.getMessage());
        }
        
        System.out.println
	    ("Intentamos una puja sobre una subasta que no existe.");
        try { 
            cs.pujar(100,new Puja("Luis",125)); 
        } catch(SubastaIncorrecta e) {
            System.out.println
		("CORRECTO, la subasta no existe."+e.getMessage());
        } catch(PujaInvalida e)  {
            System.out.println
		("ERROR, la puja debe ser correcta."+e.getMessage());
        }

        System.out.println("Intentamos una puja incorrecta sobre una subasta.");
        try { 
            cs.pujar(1,new Puja("Adolfo",125)); 
        } catch(SubastaIncorrecta e) {
            System.out.println("ERROR, la subasta no existe."+e.getMessage());
        } catch(PujaInvalida e)  {
            System.out.println
		("CORRECTO, la puja debe ser incorrecta."+e.getMessage());
        }
        
        System.out.println("Intentamos una puja incorrecta sobre una subasta.");
        try { 
            cs.pujar(1,new Puja("Mario",125)); 
        } catch(SubastaIncorrecta e) {
            System.out.println("ERROR, la subasta no existe."+e.getMessage());
        } catch(PujaInvalida e)  {
            System.out.println
		("CORRECTO, la puja debe ser incorrecta."+e.getMessage());
        }
        
        System.out.println("Intentamos una puja incorrecta sobre una subasta.");
        try { 
            cs.pujar(5,new Puja("Manuel",200)); 
        } catch(SubastaIncorrecta e) {
            System.out.println("ERROR, la subasta no existe."+e.getMessage());
        } catch(PujaInvalida e)  {
            System.out.println
		("CORRECTO, la puja debe ser incorrecta."+e.getMessage());
        }
        
        cs.resumenActividad("resMedio.txt");
        
        cs.cerrarSubastas();
        
        cs.resumenActividad("resFinal.txt");
        
    }
}
