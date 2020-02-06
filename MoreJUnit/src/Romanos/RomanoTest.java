package Romanos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanoTest {
	
	Romano r = new Romano(0, "");

	@Test
	public void roman2decTESTXXXI() {
		double resultado = r.roman2dec("XXXI");
		double esperado = 31.0;
		double error = 0.5;
		assertEquals(esperado, resultado, error);
	}
	
	@Test
	public void dec2romanTEST2001() {
		String resultado = r.dec2roman(2001.0);
		String esperado = "MMI";
		assertEquals(esperado, resultado);
	}

}
