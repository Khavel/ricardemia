package p4;

public abstract class AlumnoEPS implements Alumno {
    protected String apellidos;
    protected String nombre;
    protected float nota;
    protected boolean becario;
    public AlumnoEPS(String nombre,String apellidos,float nota, boolean becario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.becario = becario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public float getNotaMedia() {
        return this.nota;
    }
    public abstract void isBecario();
}
