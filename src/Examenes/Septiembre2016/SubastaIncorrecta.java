package Examenes.Septiembre2016;

/**
 * Excepcion SubastaIncorrecta que indica que un identificador
 * de subasta no es correcto
 * 
 * @author Adolfo Garandal
 * @version 31-08-2016
 */
public class SubastaIncorrecta extends Exception {
    public SubastaIncorrecta(String msg) {
        super(msg);
    }
}
