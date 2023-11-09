package co.edu.poli.RegistroCursos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.RegistroCursos.model.Curso;
import co.edu.poli.RegistroCursos.model.Estudiante;

class testCurso {

	@Test
    public void testCalcularRangoEst() {
        Estudiante[] estudiantes = {
            new Estudiante(1, "Andres", 20, "andres@gmail.com", "15154d"),
            new Estudiante(2, "Paula", 25, "paula@gmail.com", "151559l"),
            new Estudiante(3, "Andrea", 30, "andrea@gmail.com", "556ñlñ")
        };

        Curso.setEstudiantes(estudiantes);

        Curso curso = new Curso(1, "Curso de Prueba", "Descripcion", null, estudiantes);

        int resultado = curso.calcularRangoEst(20, 30);

        assertEquals(3, resultado);
    }

    @Test
    public void testCalcularRangoEstVacio() {
        Estudiante[] estudiantes = {};

        Curso.setEstudiantes(estudiantes);

        Curso curso = new Curso(1, "Curso de Prueba", "Descripcion", null, estudiantes);

        int resultado = curso.calcularRangoEst(20, 30);

        assertEquals(0, resultado);
    }

    @Test
    public void testDescuento() {
        Curso curso = new Curso(1, "Curso de Prueba", "Descripcion", null, null);

        double resultado = curso.descuento(1);

        assertEquals(0.3, resultado, 0.001);
    }

    @Test
    public void testDescuentoInvalido() {
        Curso curso = new Curso(1, "Curso de Prueba", "Descripcion", null, null);

        double resultado = curso.descuento(6);

        assertEquals(0, resultado, 0.001);
    }
}
