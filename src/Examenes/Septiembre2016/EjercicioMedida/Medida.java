package Examenes.Septiembre2016.EjercicioMedida;

public class Medida {
    private String unidades;
    private int tipo;
    private double valor;

    public Medida(String descripcion){
        String[] splited = descripcion.split("\\s+");
        switch(splited[0]){
            case "Intensidad":
                unidades = splited[2];
                //tipo = INTENSIDAD;
                valor = Double.parseDouble(splited[1]);
                break;

            case "Voltaje":
                unidades = splited[2];
                //tipo = VOLTAJE;
                valor = Double.parseDouble(splited[1]);
                break;

            case "Potencia":
                unidades = splited[2];
               // tipo = POTENCIA;
                valor = Double.parseDouble(splited[1]);
                break;
        }
    }

}
