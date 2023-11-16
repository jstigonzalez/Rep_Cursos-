
package co.edu.poli.RegistroCursos.model;

import java.io.Serializable;

/**
 * La clase Curso extiende de Curso_Main y representa un curso especifico
 * con un grupo de instructores y un conjunto de estudiantes inscritos.
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Curso extends Curso_Main implements Serializable {

    // Atributos
    private Instructor[] instructor;   // Arreglo de instructores asignados al curso.
    private static Estudiante[] estudiantes; // Arreglo de estudiantes inscritos en el curso.

    // CONSTRUCTOR

    /**
     * Constructor de la clase Curso.
     *
     * @param id          El identificador unico del curso.
     * @param nombre      El nombre del curso.
     * @param descripcion La descripcion del curso.
     * @param instructor  Arreglo de instructores asignados al curso.
     * @param estudiantes Arreglo de estudiantes inscritos en el curso.
     */
    public Curso(int id, String nombre, String descripcion, Instructor[] instructor, Estudiante[] estudiantes) {
        super(id, nombre, descripcion);
        this.instructor = instructor;
        this.estudiantes = estudiantes;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene el arreglo de instructores asignados al curso.
     *
     * @return El arreglo de instructores.
     */
    public Instructor[] getInstructor() {
        return instructor;
    }

    /**
     * Establece el arreglo de instructores asignados al curso.
     *
     * @param instructor El arreglo de instructores.
     */
    public void setInstructor(Instructor[] instructor) {
        this.instructor = instructor;
    }

    /**
     * Obtiene el arreglo de estudiantes inscritos en el curso.
     *
     * @return El arreglo de estudiantes.
     */
    public static Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    /**
     * Establece el arreglo de estudiantes inscritos en el curso.
     *
     * @param estudiantes El arreglo de estudiantes.
     */
    public static void setEstudiantes(Estudiante[] estudiantes) {
        Curso.estudiantes = estudiantes;
    }

    // METODOS

    /**
     * Calcula cuantos estudiantes tienen una edad dentro de un rango especifico.
     *
     * @param edadMinima La edad minima del rango.
     * @param edadMaxima La edad maxima del rango.
     * @return El numero de estudiantes dentro del rango de edades.
     */
    public int calcularRangoEst(int edadMinima, int edadMaxima) {
        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            int edadEstudiante = estudiantes[i].getEdad();
            if (edadEstudiante >= edadMinima && edadEstudiante <= edadMaxima) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Calcula cuantos estudiantes estan inscritos en el curso.
     *
     * @return El numero de estudiantes inscritos.
     */
    public static int calcularRangoEst() {
        int y = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (!(estudiantes[i] == null)) {
                y++;
            }
        }
        return y;
    }

    /**
     * Implementacion del metodo de la superclase para proporcionar un descuento
     * basado en un codigo de descuento.
     *
     * @param descuentico El codigo de descuento.
     * @return El porcentaje de descuento aplicado.
     */
    @Override
    public double descuento(int descuentico) {
        double num = 0;
        if (descuentico == 1 || descuentico == 2 || descuentico == 3) {
            num = 0.3;
        } else if (descuentico == 4 || descuentico == 5) {
            num = 0.2;
        }
        return num;
    }

	
}


