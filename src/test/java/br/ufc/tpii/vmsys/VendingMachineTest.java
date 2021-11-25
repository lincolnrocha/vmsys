package br.ufc.tpii.vmsys;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void testAddItem() {
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.addItem(new Item("Pipe", 0.5, 20));
		assertEquals(vendingMachine.numberOfItems(), 1);
		
		vendingMachine.addItem(new Item("Fini", 0.5, 10));
		assertEquals(vendingMachine.numberOfItems(), 2);
	}

	@Test
	public void testRemoveItem() {
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.addItem(new Item("Pipe", 0.5, 20));		
		vendingMachine.addItem(new Item("Fini", 0.5, 10));
		vendingMachine.removeItem("Pipe");
		
		assertEquals(vendingMachine.numberOfItems(), 1);
	}

	@Test
	public void testGetItem() {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.addItem(new Item("Pipe", 0.5, 20));
		vendingMachine.addItem(new Item("Fini", 0.5, 10));
		
		assertEquals(vendingMachine.getItem("Pipe").getName(), "Pipe");
		assertEquals(vendingMachine.getItem("Pipe").getPrice(), 0.5, 0.0);
		assertEquals(vendingMachine.getItem("Pipe").getCount(), 20, 20);
	}

	@Test
	public void testNumberOfItems() {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.addItem(new Item("Pipe", 0.5, 20));
		vendingMachine.addItem(new Item("Fini", 0.5, 10));

		assertEquals(vendingMachine.numberOfItems(), 2, 0.0);
	}

	@Test
	public void testAddCoins() {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.addCoins(10);
		
		assertEquals(vendingMachine.getCoinsDeposited(), 10, 0.0);		
	}

	@Test
	public void testAddCoinsNegative() {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.addCoins(1);
		
		assertEquals(vendingMachine.getCoinsDeposited(), 1, 0.0);		
	}
	
	@Test
	public void testVend() {
		//fail("Not yet implemented");
	}

}