
import java.util.*;
public class RestaurantOne {
	
	private Product[] menu;
	private int currentIndex = 0;
	private RestaurantOneIterator oneIT;
	
	public RestaurantOne(){
		this.menu = new Product[256];
	}

	public void addToMenu(Product product){

		this.menu[this.currentIndex++] = product;
	}
	public void createIterator(){
		this.oneIT = new RestaurantOneIterator(this.menu);
	}
	public RestaurantOneIterator getIterator(){
		return this.oneIT;
	}
	
	
}


