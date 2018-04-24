package Problema5;

public class ParteTrabajo {
    private int horas;
    private String trabajador;
    private String dia;

    public ParteTrabajo(int horas, String trabajador, String dia) {
        this.horas = horas;
        this.trabajador = trabajador;
        this.dia = dia;
    }

    public String getDiaSemana(){
        return dia;
    }

    public String getTrabajador() {
        return trabajador;
    }
}
