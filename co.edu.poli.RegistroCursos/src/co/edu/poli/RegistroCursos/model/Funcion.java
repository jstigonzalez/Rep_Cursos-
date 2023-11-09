package co.edu.poli.RegistroCursos.model;

/**
 * La interfaz Funcion proporciona un metodo para calcular el factorial de un numero entero.
 * Tambien proporciona un metodo para calcular el seno de un numero utilizando la serie de Maclaurin.
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public interface Funcion {

    /**
     * Calcula el factorial de un numero entero.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @return El factorial del numero n.
     */
    int calcularFactorial(int n);

    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin.
     *
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @return El valor del seno de x.
     */
    double calcularSenoMaclaurin(double x);
}