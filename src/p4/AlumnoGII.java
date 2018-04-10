package p4;

public class AlumnoGII extends AlumnoEPS {
    public AlumnoGII(String nombre, String apellidos, float nota,boolean becario) {
        super(nombre, apellidos, nota,becario);
    }
    public void isBecario(){
        if(this.becario)
            System.out.println("Es becario de GII");
        else
            System.out.println("NO es becario de GII");
    }
}