package p4;

public class AlumnoGIOI extends AlumnoEPS {
    public AlumnoGIOI(String nombre, String apellidos, float nota,boolean becario) {
        super(nombre, apellidos, nota,becario);
    }
    public void isBecario(){
        if(this.becario)
            System.out.println("Es becario de GIOI");
        else
            System.out.println("NO es becario de GIOI");
    }
}
