package co.edu.poli.RegistroCursos.model;

import java.io.Serializable;

/**
 * La clase abstracta Curso_Main es la superclase para los cursos y proporciona
 * metodos y atributos comunes para todos los cursos.
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */

public abstract class Curso_Main implements Funcion, Serializable {

    // Atributos
    private int id;         // El identificador unico del curso.
    private String nombre;  // El nombre del curso.
    private String descripcion; // La descripcion del curso.

    // CONSTRUCTOR

    /**
     * Constructor de la clase Curso_Main.
     *
     * @param id          El identificador unico del curso.
     * @param nombre      El nombre del curso.
     * @param descripcion La descripcion del curso.
     */
    public Curso_Main(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene el identificador del curso.
     *
     * @return El identificador del curso.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del curso.
     *
     * @param id El identificador del curso.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre El nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripcion del curso.
     *
     * @return La descripcion del curso.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del curso.
     *
     * @param descripcion La descripcion del curso.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // METODOS

    /**
     * Devuelve una representacion en cadena de la instancia de Curso_Main.
     *
     * @return Una cadena que representa la instancia de Curso_Main.
     */
    @Override
    public String toString() {
        return "Curso_Main{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    /**
     * Retorna el nombre de la superclase.
     *
     * @return Una cadena que indica que es la superclase.
     */
    protected String nombre() {
        return "Esta es la super clase " + getClass().getSimpleName();
    }

    /**
     * Metodo abstracto que calcula un descuento.
     *
     * @param descuentico El valor del descuento.
     * @return El valor con descuento.
     */
    public abstract double descuento(int descuentico);

    /**
     * Retorna una fecha de corte predefinida.
     *
     * @return La fecha de corte en formato "dd/mm/yyyy".
     */
    public String Fecha_corte() {
        return "12/02/2023";
    }

    /**
     * Calcula el factorial de un numero utilizando un enfoque iterativo.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @return El factorial del numero n.
     */
    @Override
    public int calcularFactorial(int n) {
        Funcion funcion = new FuncionIterativa();
        return funcion.calcularFactorial(n);
    }

    /**
     * Calcula la retribucion en base a un valor y una funcion dada.
     *
     * @param funcion La funcion utilizada para calcular el factorial.
     * @param valor El valor para calcular el factorial.
     * @return El resultado de multiplicar el factorial del valor por 4 y dividirlo por 1000.
     */
    public double calcularRetribucion(Funcion funcion, int valor) {
        int factorial = funcion.calcularFactorial(valor);
        return factorial * 4 / 1000.0;
    }
    
    @Override
	public double calcularSenoMaclaurin(double x) {
		// TODO Auto-generated method stub
		return 0;
	}
}

