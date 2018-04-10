package p4;

public interface Alumno {
    /**
     * Obtiene el nombre del alumno.
     *
     * @return nombre
     */
    String getNombre();
    /**
     * Devuelve los apellidos del alumno.
     *
     * @return apellidos
     */
    String getApellidos();
    /**
     * Devuelve la nota media.
     *
     * @return nota media
     */
    float getNotaMedia();
    /**
     * Muestra por pantalla si el alumno es becario e indica su grado.
     */
    void isBecario();
}
