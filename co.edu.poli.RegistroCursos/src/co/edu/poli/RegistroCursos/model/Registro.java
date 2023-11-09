package co.edu.poli.RegistroCursos.model;

/**
 * La clase Registro representa un registro de cursos con informacion sobre fechas, estado y la lista de cursos.
 * author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Registro {

    /**
     * Constructor por defecto de la clase Registro.
     */
    public Registro() {
    }

    private String fecha_inicio; // La fecha de inicio del registro.
    private String fecha_fin; // La fecha de fin del registro.
    private String estado; // El estado del registro.
    private static Curso[] cursos; // Una lista de cursos asociados a este registro.

    /**
     * Constructor que permite inicializar el registro con fechas y estado.
     *
     * @param fecha_inicio La fecha de inicio del registro.
     * @param fecha_fin    La fecha de fin del registro.
     * @param estado       El estado del registro.
     */
    public Registro(String fecha_inicio, String fecha_fin, String estado) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }

    // Métodos Getters y Setters

    /**
     * Obtiene la fecha de inicio del registro.
     * @return La fecha de inicio del registro.
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * Establece la fecha de inicio del registro.
     * @param fecha_inicio La nueva fecha de inicio del registro.
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * Obtiene la fecha de fin del registro.
     * @return La fecha de fin del registro.
     */
    public String getFecha_fin() {
        return fecha_fin;
    }

    /**
     * Establece la fecha de fin del registro.
     * @param fecha_fin La nueva fecha de fin del registro.
     */
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * Obtiene el estado del registro.
     * @return El estado del registro.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del registro.
     * @param estado El nuevo estado del registro.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la lista de cursos asociados a este registro.
     * @return La lista de cursos asociados a este registro.
     */
    public static Curso[] getCursos() {
        return cursos;
    }

    /**
     * Establece la lista de cursos asociados a este registro.
     * @param cursos La nueva lista de cursos asociados a este registro.
     */
    public static void setCursos(Curso[] cursos) {
        Registro.cursos = cursos;
    }

    /**
     * Representacion en cadena del objeto Registro.
     *
     * @return Una cadena que representa el registro con sus fechas y estado.
     */
    @Override
    public String toString() {
        return "Registro [fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", estado=" + estado + "]";
    }
}

