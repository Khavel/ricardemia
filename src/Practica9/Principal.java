package Practica9;

public class Principal {
    public static void main(String[] args){
        Trayectoria tr1 = new Trayectoria(8834);
        tr1.recogePosiciones(200);
        tr1.muestraAvion();
        Posicion pos1 = new Posicion(70,70);
        System.out.println("Pasa a menos de 300 km:" + tr1.pasaCerca(pos1,300));
        System.out.println("Pasa a menos de 200 km:" + tr1.pasaCerca(pos1,200));

        Posicion r1 = new Posicion(500,100);
        Posicion r2 = new Posicion(100,10);
        Posicion[] estan = tr1.estanDentroRect(r1,r2);
        System.out.println("Puntos dentro del rectangulo: "+estan.length);
        for(Posicion p:estan){
            System.out.println("Si esta " + p.toString());
        }

        r1 = new Posicion(10,10);
        r2 = new Posicion(5,5);
        Posicion[] noEstan = tr1.estanDentroRect(r1,r2);
        System.out.println("Puntos dentro del rectangulo: "+noEstan.length);
        for(Posicion p:noEstan){
            System.out.println("No esta " +p.toString());
        }
        System.exit(0);
    }
}
