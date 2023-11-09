package co.edu.poli.RegistroCursos.model;
/**
 * La clase Instructor representa a un instructor con atributos como id, nombre,
 * correo y especialidad. 
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Instructor {

    // Atributos
    private int id;           // El identificador unico del instructor.
    private String nombre;    // El nombre del instructor.
    private String correo;    // El correo electronico del instructor.
    private String especialidad; // La especialidad del instructor.

    // CONSTRUCTOR

    /**
     * Constructor de la clase Instructor.
     *
     * @param id          El identificador unico del instructor.
     * @param nombre      El nombre del instructor.
     * @param correo      El correo electronico del instructor.
     * @param especialidad La especialidad del instructor.
     */
    public Instructor(int id, String nombre, String correo, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene el identificador del instructor.
     *
     * @return El identificador del instructor.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del instructor.
     *
     * @param id El identificador del instructor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del instructor.
     *
     * @return El nombre del instructor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del instructor.
     *
     * @param nombre El nombre del instructor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electronico del instructor.
     *
     * @return El correo electronico del instructor.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electronico del instructor.
     *
     * @param correo El correo electronico del instructor.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la especialidad del instructor.
     *
     * @return La especialidad del instructor.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del instructor.
     *
     * @param especialidad La especialidad del instructor.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // METODO

    /**
     * Devuelve una representacion en cadena de la instancia de Instructor.
     *
     * @return Una cadena que representa la instancia de Instructor.
     */
    @Override
    public String toString() {
        return "Instructor [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", especialidad="
                + especialidad + "]";
    }
}


