package co.edu.poli.RegistroCursos.model;

/**
 * La clase FuncionIterativa implementa la interfaz Funcion y proporciona un
 * metodo para calcular el factorial de un numero de manera iterativa.
 * Adicionalmente, implementa el cálculo del seno de un número utilizando la
 * serie de Maclaurin de manera iterativa.
 * 
 * @author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class FuncionIterativa implements Funcion {

    /**
     * Calcula el factorial de un numero de manera iterativa.
     *
     * @param n El numero para el cual se calculara el factorial.
     * @return El factorial del numero n.
     */
    @Override
    public int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin de manera iterativa.
     *
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @return El valor del seno de x.
     */
    @Override
    public double calcularSenoMaclaurin(double x) {
        return calcularSenoIterativo(x);
    }

    /**
     * Calcula el seno de un numero utilizando la serie de Maclaurin de manera iterativa.
     * 
     * @param x El angulo en radianes para el cual se calculara el seno.
     * @return El valor del seno de x.
     */
    private double calcularSenoIterativo(double x) {
        double resultado = 0;
        int n = 0;
        for (int i = 0; i < 10; i++) { 
            double termino = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / calcularFactorial(2 * n + 1);
            resultado += termino;
            n++;
        }
        return resultado;
    }
}

