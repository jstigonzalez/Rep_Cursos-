package co.edu.poli.RegistroCursos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.RegistroCursos.model.*;


public class testCurso_Main {

    @Test
    public void testGetId() {
    	Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        assertEquals(1, curso.getId());
    }

    @Test
    public void testSetId() {
        Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        curso.setId(2);
        assertEquals(2, curso.getId());
    }

    @Test
    public void testGetNombre() {
        Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        assertEquals("Curso 1", curso.getNombre());
    }

    @Test
    public void testSetNombre() {
        Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        curso.setNombre("Curso 2");
        assertEquals("Curso 2", curso.getNombre());
    }

    @Test
    public void testGetDescripcion() {
        Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        assertEquals("Descripcion del curso", curso.getDescripcion());
    }

    @Test
    public void testSetDescripcion() {
        Curso_Main curso = new ConcreteCurso(1, "Curso 1", "Descripcion del curso");
        curso.setDescripcion("Nueva descripcion");
        assertEquals("Nueva descripcion", curso.getDescripcion());
    }

  

   
    private class ConcreteCurso extends Curso_Main {
        public ConcreteCurso(int id, String nombre, String descripcion) {
            super(id, nombre, descripcion);
        }

        @Override
        public double descuento(int descuentico) {
            return 0; 
        }

		@Override
		public double calcularSenoMaclaurin(double x) {
			// TODO Auto-generated method stub
			return 0;
		}
    }
}

