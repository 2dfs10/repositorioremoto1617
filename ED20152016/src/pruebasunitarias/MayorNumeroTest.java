package pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MayorNumeroTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// los métodos a ejecutar comiezan por test

	// caso normal
	@Test
	public void testSimple() {
		assertEquals(9, MayorNumero.obt_mayorNumero(new int[] { 3, 7, 9, 8 }));
	}

	// el mayor comienzo, centro, final
	@Test
	public void testOrden() {
		assertEquals(9, MayorNumero.obt_mayorNumero(new int[] { 9, 7, 8 }));
		assertEquals(9, MayorNumero.obt_mayorNumero(new int[] { 7, 9, 8 }));
		assertEquals(9, MayorNumero.obt_mayorNumero(new int[] { 7, 8, 9 }));
	}
	@Test
	public void testDuplicados() {
		assertEquals(9, MayorNumero.obt_mayorNumero(new int[] { 9, 7, 9, 8 }));
	}
	@Test
	public void testSoloUno() {
		assertEquals(7, MayorNumero.obt_mayorNumero(new int[] { 7 }));
	}
	@Test
	public void testTodosNegativos() {
		assertEquals(-4,
				MayorNumero.obt_mayorNumero(new int[] { -4, -6, -7, -22 }));
	}

}
