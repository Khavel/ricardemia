package Problema5;

public class problem {
    public static void main(String[] args){


    }


    /**
     * Ejercicio 1
     * @param grados
     * @return
     */
    public static double[] degToRad(double[] grados){
        int longitud = grados.length;
        double[] rads = new double[longitud];
        for(int i=0;i<longitud;i++){
            rads[longitud-i-1] = Math.toRadians(grados[i]);
        }
        return rads;
    }

    /**
     * Ejercicio 2
     * @param x
     * @return
     */
    public static double maximaDiferencia(double[] x){
        double maxDif = Double.MIN_VALUE;
        for(int i=1;i<x.length;i++){
            double dif = Math.abs(x[i]-x[i-1]);
            if(dif > maxDif){
                maxDif = dif;
            }
        }
        return maxDif;
    }

    /**
     * Ejercicio 3
     * @param texto
     * @param palabra
     * @return
     */
    public static int contarApariciones(String texto, String palabra){
        String[] separadas = texto.split("\\s+");
        int contador = 0;
        for(String p:separadas){
            if (p.equals(palabra)){
                contador ++;
            }
        }
        return contador;
    }

    /**
     * Ejercicio 4
     * @param partes
     * @return
     */
    public static String diaTrabajo(ParteTrabajo[] partes){
        for(ParteTrabajo p:partes){
            if(p.getTrabajador().equals("Andres")){
                return p.getDiaSemana();
            }
        }
        return null;
    }



}
