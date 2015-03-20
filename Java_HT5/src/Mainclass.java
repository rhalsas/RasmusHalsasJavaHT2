
//Rasmus Halsas
//0358373

public class Mainclass {
	public static void main(String[] args){
		RestaurantTwo restTwo = new RestaurantTwo();
		restTwo.addToMenu(new Product("beef","7.10€","herkkua"));
		restTwo.createIterator();
		RestaurantTwoIterator twoIT = restTwo.getIterator();
		
		while(twoIT.hasNext()){
			Product product = twoIT.next();
			System.out.print(" Name:" + product.getName() + " Price:" + product.getPrice() + " Description:" + product.getDescription());
		}
		
		
		RestaurantOne restOne = new RestaurantOne();
		restOne.addToMenu(new Product("kanamunia","111.90€","pahaa"));
		restOne.addToMenu(new Product("sikaa","52.40€","iha jees"));
		restOne.createIterator();
		RestaurantOneIterator oneIT = restOne.getIterator();
		
		while(oneIT.hasNext()){
			Product product = oneIT.next();
			System.out.print(" Name:" + product.getName() + " Price:" + product.getPrice() + " Description:" + product.getDescription());
		}
		
		
		
	}
}
