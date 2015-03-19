import java.util.*;



public class RestaurantTwo {
	
	private ArrayList<Product> menu = new ArrayList();
	public RestaurantTwoIterator twoIT;
	
	public void addToMenu(Product product){
		
		this.menu.add(product);
	}
	public void createIterator(){
		this.twoIT = new RestaurantTwoIterator(this.menu);
	}
	public RestaurantTwoIterator getIterator(){
		return this.twoIT;
	}
	
	
}
