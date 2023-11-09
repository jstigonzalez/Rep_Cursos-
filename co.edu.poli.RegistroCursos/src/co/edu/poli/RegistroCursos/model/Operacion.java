package co.edu.poli.RegistroCursos.model;

/**
 * La clase Operacion se encarga de realizar operaciones sobre un arreglo de cursos.
 * author Johan Stiven Gonzalez
 * @since 5/10/2023
 */
public class Operacion {

    private Curso_Main[] cursos; // Arreglo de cursos

    /**
     * Constructor de la clase Operacion. Inicializa el arreglo de cursos con un tamaño predeterminado.
     */
    public Operacion() {
        cursos = new Curso_Main[2]; // Inicializa el arreglo de cursos con capacidad para 2 cursos.
    }

    /**
     * Crea un nuevo curso y lo agrega al arreglo de cursos.
     *
     * @param cursito El curso que se va a agregar.
     * @return "guardado" si se pudo agregar el curso, "el cupo esta lleno" si no hay espacio disponible.
     */
    public String create(Curso_Main cursito) {
        boolean confirmacion = false;
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i] == null) {
                cursos[i] = cursito;
                confirmacion = true;
                break;
            }
        }
        if (confirmacion) {
            return "guardado";
        } else {
            return "el cupo esta lleno";
        }
    }

    /**
     * Elimina un curso del arreglo de cursos según su ID.
     *
     * @param id El ID del curso que se va a eliminar.
     * @return true si se pudo eliminar el curso, false si no se encontro el curso con el ID especificado.
     */
    public boolean eliminar(int id) {

        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i].getId() == id) {
                for (int j = i; j < cursos.length - 1; j++) {
                    cursos[j] = cursos[j + 1];
                }
                cursos[cursos.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra la informacion de los cursos en el arreglo.
     *
     * @param id El ID del curso que se va a mostrar.
     * @return El curso con el ID especificado o null si no se encuentra.
     */
    public Curso_Main mostrar(int id) {
        for (Curso_Main curso : cursos) {
            if (curso != null && curso.getId() == id) {
                return curso;
            }
        }
        return null; 
    }

    /**
     * Actualiza un curso existente en el arreglo.
     *
     * @param id El ID del curso que se va a actualizar.
     * @param nuevoCurso El nuevo curso que reemplazara al curso existente.
     */
    public void actualizar(int id, Curso_Main nuevoCurso) {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i].getId() == id) {
                cursos[i] = nuevoCurso;
                break;
            }
        }
    }
}