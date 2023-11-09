package co.edu.poli.RegistroCursos.model;

/**
 * La interfaz Certificado define el metodo para determinar el porcentaje minimo de asistencia requerido
 * para obtener un certificado.
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public interface Certificado {

    /**
     * Este metodo determina el porcentaje minimo de asistencia requerido para obtener un certificado.
     * @param porcentajeCursado El porcentaje de asistencia al curso.
     * @return El porcentaje minimo de asistencia requerido para obtener un certificado.
     */
    int minimoAsistencia(int porcentajeCursado);

}
