package p4;

public class AlumnoGIIAA extends AlumnoEPS {
    public AlumnoGIIAA(String nombre, String apellidos, float nota,boolean becario) {
        super(nombre, apellidos, nota,becario);
    }
    public void isBecario(){
        if(this.becario)
            System.out.println("Es becario de GIIAA");
        else
            System.out.println("NO es becario de GIIAA");
    }
}