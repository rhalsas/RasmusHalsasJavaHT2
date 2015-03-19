import java.util.*;

public class RestaurantTwoIterator implements Iterator {
	private int currentIndex = 0;
	
	private ArrayList<Product> arrayList;
	
	public RestaurantTwoIterator(ArrayList<Product> arrayList)
	{
		this.arrayList = arrayList;
	
	}

	public Product next(){
		return this.arrayList.get(this.currentIndex++);
	}

	public boolean hasNext(){
		
		return this.currentIndex < this.arrayList.size() && this.arrayList.get(this.currentIndex) != null;	
	}
}

