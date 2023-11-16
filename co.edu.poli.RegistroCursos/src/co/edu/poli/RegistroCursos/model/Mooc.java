package co.edu.poli.RegistroCursos.model;

import java.io.Serializable;

/**
 * La clase Mooc extiende de Curso_Main e implementa la interfaz Certificado.
 * Representa un curso en línea con una cantidad de videos.
 * author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Mooc extends Curso_Main implements Certificado, Serializable {

    // Atributos
    private int cantidad_de_videos; // La cantidad de videos del curso MOOC.

    // CONSTRUCTOR
    /**
     * Constructor de la clase Mooc.
     *
     * @param id Identificador del curso.
     * @param nombre Nombre del curso.
     * @param descripcion Descripcion del curso.
     * @param cantidad_de_videos Cantidad de videos en el curso.
     */

    public Mooc(int id, String nombre, String descripcion, int cantidad_de_videos) {
        super(id, nombre, descripcion);
        this.cantidad_de_videos = cantidad_de_videos;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene la cantidad de videos del curso MOOC.
     *
     * @return La cantidad de videos.
     */
    public int getCantidad_de_videos() {
        return cantidad_de_videos;
    }

    /**
     * Establece la cantidad de videos del curso MOOC.
     *
     * @param cantidad_de_videos La cantidad de videos.
     */
    public void setCantidad_de_videos(int cantidad_de_videos) {
        this.cantidad_de_videos = cantidad_de_videos;
    }

    // MÉTODOS

    /**
     * Devuelve una representacion en cadena de la instancia de Mooc.
     *
     * @return Una cadena que representa la instancia de Mooc.
     */
    @Override
    public String toString() {
        return "Mooc{" +
                "cantidad_de_videos=" + cantidad_de_videos + nombre() +
                '}';
    }

    /**
     * Retorna el nombre de la subclase.
     *
     * @return Una cadena que indica que es la subclase.
     */
    protected String nombre() {
        return "Esta es la subclase " + getClass().getSimpleName();
    }

    /**
     * Implementacion del metodo de la interfaz Certificado para proporcionar un
     * descuento basado en un codigo de descuento.
     *
     * @param descuentico El codigo de descuento.
     * @return El porcentaje de descuento aplicado.
     */
    @Override
    public double descuento(int descuentico) {
        double num = 0;
        if (descuentico == 1 || descuentico == 2 || descuentico == 3) {
            num = 0.1;
        } else if (descuentico == 4 || descuentico == 5) {
            num = 0.05;
        }
        return num;
    }
    
    /**
     * Implementacion del metodo de la interfaz Certificado para determinar el
     * porcentaje minimo de asistencia requerido para obtener un certificado.
     *
     * @param porcentajeCursado El porcentaje de asistencia al curso.
     * @return El porcentaje minimo de asistencia requerido para obtener un certificado.
     */
    @Override
    public int minimoAsistencia(int porcentajeCursado) {
        if (porcentajeCursado >= 80) {
            return 1; 
        } else {
            return 0; 
        }
    }

	
}