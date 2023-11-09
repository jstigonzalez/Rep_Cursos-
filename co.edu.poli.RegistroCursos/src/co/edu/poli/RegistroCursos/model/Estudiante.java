package co.edu.poli.RegistroCursos.model;
/**
 * La clase Estudiante representa a un estudiante con atributos como id, nombre,
 * edad, correo y contrasena.
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Estudiante {

    // Atributos
    private int id;          // El identificador unico del estudiante.
    private String nombre;   // El nombre del estudiante.
    private int edad;        // La edad del estudiante.
    private String correo;   // El correo electronico del estudiante.
    private String contrasena; // La contrasena del estudiante.

    // CONSTRUCTOR

    /**
     * Constructor de la clase Estudiante.
     *
     * @param id          El identificador unico del estudiante.
     * @param nombre      El nombre del estudiante.
     * @param edad        La edad del estudiante.
     * @param correo      El correo electronico del estudiante.
     * @param contrasena  La contrasena del estudiante.
     */
    public Estudiante(int id, String nombre, int edad, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene el identificador del estudiante.
     *
     * @return El identificador del estudiante.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del estudiante.
     *
     * @param id El identificador del estudiante.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre El nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return La edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     *
     * @param edad La edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el correo electronico del estudiante.
     *
     * @return El correo electronico del estudiante.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electronico del estudiante.
     *
     * @param correo El correo electronico del estudiante.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contrasena del estudiante.
     *
     * @return La contrasena del estudiante.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contrasena del estudiante.
     *
     * @param contrasena La contrasena del estudiante.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // METODO

    /**
     * Devuelve una representacion en cadena de la instancia de Estudiante.
     *
     * @return Una cadena que representa la instancia de Estudiante.
     */
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
