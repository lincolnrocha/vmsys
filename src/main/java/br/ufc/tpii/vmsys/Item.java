package br.ufc.tpii.vmsys;

public class Item {
	private String name;
	private double price = 0.0;
	private int count = 0;

	public Item(String name, double price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void decCount() {
		this.count--;
	}

	public void incCount() {
		this.count++;
	}
}