package shoppingcart;

public class Item {
	String name;
	double price;
	int quantity;

	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public Item() {
	}

	public String getName() {

		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {

		return quantity;
	}

	public String toString() {
		return "Item: " + this.name + "Price: $" + this.price + " Quantity:" + this.quantity;
	}
}