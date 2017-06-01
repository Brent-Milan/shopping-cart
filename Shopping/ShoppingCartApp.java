package Shopping;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		CartItem mangoes = new CartItem("mango", 1.25, 4); 
		System.out.println(mangoes);
		
		cart.addMethod(mangoes);
		
		CartItem avocados = new CartItem("avocado", 1.79, 3);
		
		cart.addMethod(avocados);
		
		System.out.println(cart);
		
		System.out.println("Your total price is " + cart.totalCost());
		
	}

}
