
public class ShapeBorderDecorator extends ShapeDecorator{

	
	 public ShapeBorderDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	  
	   public void draw() {
	      decoratedShape.draw();
	      System.out.println("Border color: " + decoratedShape.getBorder() +"\n");
	    }

	
	public String getBorder() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public String getFill() {
		// TODO Auto-generated method stub
		return null;
	}



	 
	
}
