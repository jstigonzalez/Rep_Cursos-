package co.edu.poli.RegistroCursos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.RegistroCursos.model.FuncionIterativa;

class testFuncionIterativa {

	 @Test
	    public void testCalcularFactorial() {
	        FuncionIterativa funcion = new FuncionIterativa();
	        
	        // Prueba con n = 0
	        assertEquals(1, funcion.calcularFactorial(0));
	        
	        // Prueba con n = 1
	        assertEquals(1, funcion.calcularFactorial(1));
	        
	        // Prueba con n = 5
	        assertEquals(120, funcion.calcularFactorial(5));
	        
	        // Agrega más pruebas según lo necesites.
	    }
	}
