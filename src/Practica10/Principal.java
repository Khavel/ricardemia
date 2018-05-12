package Practica10;

public class Principal {
    public static void main(String[] args){
        Coche cocherino = new Coche(18.5,1.1,4.5,"obstaculos.txt");
        try{
            System.out.println("El identificador es: "+cocherino.pocoMargenAlcance().getId());
            System.out.println("A continuacion se muestran los posibles choques:");
            for(Obstaculo obs:cocherino.posiblesChoques()){
                System.out.println(obs.getId());
            }
        }catch (NoEncontrado e){
            System.out.println("Error, no se ha encontrado el obstaculo!");
        }
        cocherino.informe();
        cocherino.dibujoEsquematico();

    }
}
