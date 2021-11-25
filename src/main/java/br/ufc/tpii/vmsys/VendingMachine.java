package br.ufc.tpii.vmsys;

import java.util.HashMap;

import br.ufc.tpii.vmsys.exceptions.InsufficientFunds;
import br.ufc.tpii.vmsys.exceptions.InvalidSelection;
import br.ufc.tpii.vmsys.exceptions.OutOfStock;

public class VendingMachine {

	private double coinsDeposited = 0.0;

	private static HashMap<String, Item> inventory = new HashMap<String, Item>();

	public void addItem(Item item) {
		inventory.put(item.getName(), item);
	}
	
	public void removeItem(String itemName) {
		inventory.remove(itemName);
	}

	public Item getItem(String itemName) {
		return inventory.get(itemName);
	}
	
	public int numberOfItems() {
		return inventory.size();
	}

	public void addCoins(double coins) {
		this.coinsDeposited -= coins;
	}

	public double getCoinsDeposited() {
		return this.coinsDeposited;
	}

	public void vend(String itemName) throws InvalidSelection, OutOfStock, InsufficientFunds {
		Item item = inventory.get(itemName);
		
		if (item == null) {
			throw new InvalidSelection();
		}

		if (item.getCount() <= 0) {
			throw new OutOfStock();
		}

		if (item.getPrice() <= this.coinsDeposited) {
			throw new InsufficientFunds();
		}

		this.coinsDeposited -= item.getPrice();

		item.decCount();
	}
}