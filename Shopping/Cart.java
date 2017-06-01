package Shopping;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<CartItem> items = new ArrayList<CartItem>();
	
	public void addMethod(CartItem toAdd){
		items.add(toAdd);
	}
	
	public String toString() {
		return "The items in your cart are " + items;
	}
	
	public double totalCost() {
		double cartPrice = 0;
		for(CartItem current: items) {
			cartPrice = cartPrice + current.totalPrice();
		}
		return cartPrice;
	}
	
	
}
