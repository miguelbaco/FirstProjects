import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testgrados {
	grados g = new grados();
	
	@Test
	public void testFC5() {
		double resultado = g.celsiusfarenheit(-5.0);
		double esperado = 23;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void testCF5() {
		double resultado = g.farenheitcelsius(-5.0);
		double esperado = -20.555;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void testFC0() {
		double resultado = g.celsiusfarenheit(0.0);
		double esperado = 32;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void testCF0() {
		double resultado = g.farenheitcelsius(0.0);
		double esperado = -17.77;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	public void testFC15() {
		double resultado = g.celsiusfarenheit(15.0);
		double esperado = 59.0;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void testCF15() {
		double resultado = g.farenheitcelsius(15.0);
		double esperado = -9.444;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	public void testFC32() {
		double resultado = g.celsiusfarenheit(32.0);
		double esperado = 89.6;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void testCF32() {
		double resultado = g.farenheitcelsius(32.0);
		double esperado = 0;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
}
