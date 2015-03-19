


public class RestaurantOneIterator implements Iterator {
	private int currentIndex = 0;
	
	private Product array[];
	
	public RestaurantOneIterator(Product[] array)
	{
		this.array = array;
	
	}

	public Product next(){
		return this.array[this.currentIndex++];
	}

	public boolean hasNext(){
		
		return this.currentIndex < this.array.length && this.array[this.currentIndex] != null;	
	}

}
