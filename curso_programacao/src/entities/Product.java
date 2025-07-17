package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// construtores

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProductsInStock(int quantity) {
		// ambiquidade entre atributo e metodo, usasse a palavra "this"
		this.quantity += quantity;
	}

	public void removeQuantityStock(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
}
