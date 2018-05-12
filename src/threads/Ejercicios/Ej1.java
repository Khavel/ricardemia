package threads.Ejercicios;

public class Ej1 {

    public static double costeBillete(int servicio, int tipoCliente){
        double coste = 0;
        switch(servicio){
            case 1:
                    if(tipoCliente == 10){
                        coste += 25;
                    }else if(tipoCliente == 20){
                        coste += 22;
                    }
                break;

            case 2:
                if(tipoCliente == 10){
                    coste += 11;
                }else if(tipoCliente == 20){
                    coste += 10;
                }
                break;

            case 3:
                if(tipoCliente == 10){
                    coste += 6;
                }else if(tipoCliente == 20){
                    coste += 5;
                }
                break;
        }
        return coste;
    }

}
