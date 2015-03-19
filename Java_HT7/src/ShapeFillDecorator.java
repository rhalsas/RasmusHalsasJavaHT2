
public class ShapeFillDecorator extends ShapeDecorator {
	

	public ShapeFillDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	
	      System.out.println("Fill color: " + decoratedShape.getFill()  +"\n");
	   }

	@Override
	public String getBorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFill() {
		// TODO Auto-generated method stub
		return null;
	}

	 
}
