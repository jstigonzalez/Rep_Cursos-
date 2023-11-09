package co.edu.poli.RegistroCursos.model;

/**
 * La clase FuncionRecursivaCola implementa la interfaz Funcion y proporciona
 * metodos para calcular el factorial y el seno de un numero de manera recursiva
 * utilizando la tecnica de recursividad de cola.
 * 
 * Para el calculo del factorial, se utiliza la recursividad de cola para optimizar
 * el uso de la pila de llamadas.
 * 
 * Para el calculo del seno utilizando la serie de Maclaurin, tambien se utiliza
 * la recursividad de cola para mejorar la eficiencia del calculo.
 * 
 * @author [Nombre del autor]
 * @since [Fecha de creación]
 */
public class FuncionRecursivaCola implements Funcion {

    /**
     * Calcula el factorial de un numero de manera recursiva utilizando la tecnica de recursividad de cola.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @return El factorial del numero n.
     */
    @Override
    public int calcularFactorial(int n) {
        return calcularRecursiveTail(n, 1);
    }

    /**
     * Método auxiliar para el cálculo del factorial utilizando recursividad de cola.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @param resultadoParcial El resultado parcial acumulado durante la recursion.
     * @return El factorial del numero n.
     */
    private int calcularRecursiveTail(int n, int resultadoParcial) {
        if (n == 0 || n == 1) {
            return resultadoParcial;
        } else {
            return calcularRecursiveTail(n - 1, resultadoParcial * n);
        }
    }
    
    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin de manera recursiva
     * y con recursividad de cola para optimizar la eficiencia del calculo.
     *
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @return El valor del seno de x.
     */
    @Override
    public double calcularSenoMaclaurin(double x) {
        return calcularSenoRecursivoDeCola(x, 1, x, 1); 
    }

    /**
     * Método auxiliar para el cálculo del seno utilizando la serie de Maclaurin con recursividad de cola.
     *
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @param terminoActual El número actual de la serie de Maclaurin.
     * @param resultadoParcial El resultado parcial acumulado durante la recursión.
     * @param signo El signo del término actual.
     * @return El valor del seno de x.
     */
    private double calcularSenoRecursivoDeCola(double x, int terminoActual, double resultadoParcial, int signo) {
        if (terminoActual == 10) { 
            return resultadoParcial;
        } else {
            double nuevoTermino = ((-1) * resultadoParcial * x * x) / ((2 * terminoActual + 1) * (2 * terminoActual));
            return calcularSenoRecursivoDeCola(x, terminoActual + 1, resultadoParcial + signo * nuevoTermino, -signo);
        }
    }
}
