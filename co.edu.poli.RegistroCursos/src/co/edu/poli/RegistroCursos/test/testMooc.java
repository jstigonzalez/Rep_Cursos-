package co.edu.poli.RegistroCursos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.RegistroCursos.model.Mooc;

class testMooc {

	@Test
    void testMinimoAsistencia() {
        Mooc mooc = new Mooc(1, "Curso MOOC", "Descripción", 10);
        
        // Caso en el que el porcentaje de asistencia es menor al 80%
        int porcentajeCursado1 = 70;
        assertEquals(0, mooc.minimoAsistencia(porcentajeCursado1));
        
        // Caso en el que el porcentaje de asistencia es igual al 80%
        int porcentajeCursado2 = 80;
        assertEquals(1, mooc.minimoAsistencia(porcentajeCursado2));
        
        // Caso en el que el porcentaje de asistencia es mayor al 80%
        int porcentajeCursado3 = 90;
        assertEquals(1, mooc.minimoAsistencia(porcentajeCursado3));
    }

    @Test
    void testDescuento() {
        Mooc mooc = new Mooc(1, "Curso MOOC", "Descripción", 10);
        
        // Casos de prueba para el método de descuento
        assertEquals(0.1, mooc.descuento(1));
        assertEquals(0.1, mooc.descuento(2));
        assertEquals(0.1, mooc.descuento(3));
        assertEquals(0.05, mooc.descuento(4));
        assertEquals(0.05, mooc.descuento(5));
        assertEquals(0, mooc.descuento(6));
    }

}