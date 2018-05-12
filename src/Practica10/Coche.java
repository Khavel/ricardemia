package Practica10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.io.*;
import fundamentos.Dibujo;
import fundamentos.ColorFig;
/**
 * Clase para simular y probar el funcionamiento del sistema de
 * deteccion de colisiones
 */
public class Coche {

    private ArrayList<Obstaculo> lista; //una lista de obstaculos
    private double vC;                  // velocidad del coche en m/s
    private final double A,L;           // dimensiones del coche 
                                        // (semianchura y longitud) en m
    /**
     * Constructor que recibe como parametros la velocidad del coche
     * vC en m/s, las dimensiones A y L del coche en m y el nombre de
     * un fichero de texto del que se leen datos para rellenar la
     * lista de obstaculos
     * 
     * @param vC velocidad del coche, m/s
     * @param A  semianchura del coche, m
     * @paral L longitud del coche, m
     * @param nombreFichero el nombre del fichero de texto del que se lee 
     *                      la lista de obstaculos a probar
     */
    public Coche(double vC, double A, double L, String nombreFichero) {
        // Copiamos los atributos
        this.vC = vC;
        this.A = A;
        this.L = L;
        // Creamos la lista de obtaculos vacia
        lista = new ArrayList<Obstaculo>();
        // Abrimos el fichero para leer
        try (Scanner in=new Scanner(new FileReader(nombreFichero))) {
            // Ponemos la convencion de lectura de numeros a ingles
            in.useLocale(Locale.ENGLISH);
            int id;
            double vT,vN,d,alfa,r;
            // Saltarse la primera linea del fichero
            in.nextLine();
            // Bucle mientras haya mas datos por leer
            while (in.hasNext()) {
                // leer los datos de un obstaculo
                id = in.nextInt();
                vT = in.nextDouble();
                vN = in.nextDouble();
                d = in.nextDouble();
                alfa = in.nextDouble();
                r = in.nextDouble();
                // Crear el obstaculo con los datos leidos
                Obstaculo nuevo = new Obstaculo(id,r);
                nuevo.set(vT,vN,d,alfa);
                // Anadir el obstaculo a la lista
                lista.add(nuevo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No encuentro el fichero");
            // Error grave. Se abandona el programa
            System.exit(-1);
        }
    }
    
    /**
     * Retorna un array conteniendo todos los obstaculos para los que se 
     * detecta un posible choque
     * 
     * @return array con los obstaculos con los que es posible chocar
     */
    public Obstaculo[] posiblesChoques() {
	    ArrayList<Obstaculo> posiblesChoques = new ArrayList<Obstaculo>();

	    for(Obstaculo obs:lista){
	        boolean choca = false;
	        if((obs.tAlcance(vC)>=0 && obs.tAlcance(vC)<=30) && (obs.tRebase(vC,L)>=0 && obs.tRebase(vC,L)<=30)){
                if(Math.abs(obs.margenAlcance(vC)) <= obs.getRadio()+A){
                    choca = true;
                }else if(Math.abs(obs.margenRebase(vC,L)) <= obs.getRadio() + A){
                    choca = true;
                }else if((obs.margenAlcance(vC)*obs.margenRebase(vC,L)) < 0){
                    choca = true;
                }
            }
            if(choca){
	            posiblesChoques.add(obs);
            }
        }
        Obstaculo[] posibles = new Obstaculo[posiblesChoques.size()];
	    for(int i=0;i<posibles.length;i++){
	        posibles[i] = posiblesChoques.get(i);
        }
	    return posibles;
    }

    /**
     * Pone en pantalla un informe de todos los obstaculos
     */
    public void informe() {
        System.out.println("Id           "+"tiempoAlcance             "+"tiempoRebase                "+"margenAlcance             "+"margenRebase           ");
        for(Obstaculo obs:lista){
            System.out.println(obs.getId()+"        "+obs.tAlcance(vC)+"        "+obs.tRebase(vC,L)+"       "+obs.margenAlcance(vC)+"       "+obs.margenRebase(vC,L));
        }
    }
    
    /**
     * Busca en la lista el primer Obstaculo cuyo margen de alcance en
     * valor absoluto es menor o iguar que r+A y lo retorna.  Si no lo
     * encuentra lanza NoEncontrado.
     * 
     * @return primer obstaculo con poco margen de alcance
     */
    public Obstaculo pocoMargenAlcance() throws NoEncontrado {
        int i=0;
        boolean encontrado = false;
        Obstaculo obstaculoConPocoMargen = null;

        while(i<lista.size() && !encontrado){
            if(Math.abs(lista.get(i).margenAlcance(vC))<= lista.get(i).getRadio()+A){
                obstaculoConPocoMargen = lista.get(i);
                encontrado = true;
            }else{
                i++;
            }
        }
        if(encontrado){
            return obstaculoConPocoMargen;
        }else{
            throw new NoEncontrado();
        }
    }
    
    /**
     * Hace un dibujo esquematico de los obstaculos y del coche
     */
    public void dibujoEsquematico() {
        Dibujo dib=new Dibujo("Prueba de dibujo",600,600);

        dib.borra(ColorFig.blanco);
        dib.ponGrosorLapiz(4);
        dib.ponColorLapiz(ColorFig.magenta);
        int centro = 300;
        dib.dibujaRectangulo(centro,centro,centro+20,centro+50);
        dib.ponColorLapiz(ColorFig.rojo);
        for (Obstaculo o: lista){
            dib.ponGrosorLapiz(5*(int)o.getRadio());
            double x = Math.cos(o.getAngulo()*o.getDistancia());
            double y = Math.sin(o.getAngulo()*o.getDistancia());

            x = x*200;
            y = y*200;
            System.out.println(300+x);
            System.out.println(300+y);

            dib.dibujaPunto(300+(int)x,300+(int)y);
        }

        dib.espera();
        //necesario para que se pinte la ventana
    }
    
}
