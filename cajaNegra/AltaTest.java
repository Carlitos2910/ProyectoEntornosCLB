package Alta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AltaTest {

	@Test
	public void testId() throws Exception {
		int obtenido = Alta.Alta_Usuario2.IdUsuario(0);
		int esperado = 0;
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testId2() throws Exception {
		int obtenido = Alta.Alta_Usuario2.IdUsuario(-1);
		int esperado = 0;
		assertEquals(esperado, obtenido);
	}
	
}