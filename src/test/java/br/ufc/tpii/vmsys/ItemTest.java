package br.ufc.tpii.vmsys;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testDecCount() {
		Item item = new Item("Pipe", 0.5, 20);
		item.decCount();
		assertEquals("Erro!", item.getCount(), 19);
	}

	@Test
	public void testIncCount() {
		Item item = new Item("Pipe", 0.5, 20);
		item.incCount();
		assertEquals("Erro no teste incCount!", item.getCount(), 21);
	}

}
	