
import java.awt.Color;

/**
 * ColorFig por Michael Gonzalez y Mariano Benito. 
 * Version 3.3. Octubre 2012. <p>
 * Clase que define algunos colores usados en la clase Dibujo <p>
 *
 * @author Mariano Benito Hoz <mbenitohoz at gmail dot com>
 * @version 3.2
 */
public class ColorFig2 {

    private Color col;

    // Constructor privado, que obtiene el color
    //   a partir de un objeto de la clase Color
    private ColorFig2(Color col) {
        this.col = new Color(col.getRed(), col.getGreen(), col.getBlue());
    }

    // Retorna el color en un objeto de la clase Color
    Color colorOf() {
        return col;
    }

    /**
     * Contructor que crea un color a partir de una combinacion
     * de rojo (r) verde (g) y azul (b). Cada uno de estos datos
     * estara comprendido entre 0 y 255
     */
    public ColorFig2(int r, int g, int b) {
        this.col = new Color(r, g, b);
    }

    /** 
     * Constantes estaticas para los colores mas habituales 
     */
    public static final ColorFig2 negro = new ColorFig2(Color.black);
    public static final ColorFig2 azul = new ColorFig2(Color.blue);
    public static final ColorFig2 grisOscuro = new ColorFig2(Color.darkGray);
    public static final ColorFig2 gris = new ColorFig2(Color.gray);
    public static final ColorFig2 verde = new ColorFig2(Color.green);
    public static final ColorFig2 grisClaro = new ColorFig2(Color.lightGray);
    public static final ColorFig2 magenta = new ColorFig2(Color.magenta);
    public static final ColorFig2 naranja = new ColorFig2(Color.orange);
    public static final ColorFig2 rosa = new ColorFig2(Color.pink);
    public static final ColorFig2 rojo = new ColorFig2(Color.red);
    public static final ColorFig2 blanco = new ColorFig2(Color.white);
    public static final ColorFig2 amarillo = new ColorFig2(Color.yellow);

    /**
     *  Retorna un color mas oscuro que el original
     */
    public ColorFig2 masOscuro() {
        return new ColorFig2(col.darker());
    }

    /**
     * Retorna un color mas claro que el original
     */
    public ColorFig2 masClaro() {
        return new ColorFig2(col.brighter());
    }

}
