package Shopping;

public class CartItem {
	
	String name;
	double price;   //BigDecimal
	int quantity;
	
	public CartItem(String itemName, double itemPrice, int itemQuantity) {
		name = itemName;
		price = itemPrice;
		quantity = itemQuantity;
	}
	
	public double totalPrice() {
		return (quantity * price);
	}
	
	
	@Override
	public String toString() {
		return quantity + " " + name + " @ "+ price;
	}
	
	
	
	
	
	
	
}
