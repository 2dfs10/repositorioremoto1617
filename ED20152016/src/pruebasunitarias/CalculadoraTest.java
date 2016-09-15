package pruebasunitarias;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
public Calculadora calculadora;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.calculadora = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
		this.calculadora = null;
	}

	@Test
	public void testSumar() {
		int op1 = 2;
	     int op2 = 1;
	     int resultadoEsperado = op1 + op2;
	     int resultadoObtenido = this.calculadora.sumar(op1, op2);
	     assertEquals("Error en la suma!", resultadoEsperado, resultadoObtenido, 0);
		
		
	}

}
