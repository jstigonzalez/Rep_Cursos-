package co.edu.poli.RegistroCursos.model;

/**
 * La clase FuncionRecursiva implementa la interfaz Funcion y proporciona un
 * metodo para calcular el factorial de un numero de manera recursiva.
 * Adicionalmente, implementa el cálculo del seno de un número utilizando la
 * serie de Maclaurin de manera recursiva.
 * 
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class FuncionRecursiva implements Funcion {

    /**
     * Calcula el factorial de un numero de manera recursiva.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @return El factorial del numero n.
     */
    @Override
    public int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin de manera recursiva.
     *
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @return El valor del seno de x.
     */
    @Override
    public double calcularSenoMaclaurin(double x) {
        return calcularSenoRecursivo(x, 10);
    }

    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin de manera recursiva.
     * 
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @param terminos La cantidad de terminos en la serie de Maclaurin.
     * @return El valor del seno de x.
     */
    private double calcularSenoRecursivo(double x, int terminos) {
        if (terminos == 0) {
            return 0;
        } else {
            return ((-1) * calcularSenoRecursivo(x, terminos - 1) * x * x) / ((2 * terminos - 1) * (2 * terminos));
        }
    }
}