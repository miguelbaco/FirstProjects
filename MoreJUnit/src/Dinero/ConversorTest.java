package Dinero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorTest {
	Conversor conver = new Conversor(10.5, 9.555);

	@Test
	public void dollar2euro1() {
		double resultado = conver.dollar2euro(10.5);
		double esperado = 9.555;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void dollar2euro2() {
		double resultado = conver.dollar2euro(20.3);
		double esperado = 18.473;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void euro2dollar1() {
		double resultado = conver.euro2dollar(10.5);
		double esperado = 11.538;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void euro2dollar2() {
		double resultado = conver.euro2dollar(20.3);
		double esperado = 22.307;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}

}
