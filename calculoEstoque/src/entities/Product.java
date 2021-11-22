package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalvalueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		// quantity of the class += quantity of the parameter function
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
