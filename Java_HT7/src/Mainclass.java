//Rasmus Halsas
//0358373

public class Mainclass {

	
	public static void main(String[] args) {
		
		Shape line = new Line();
		Shape rectangle = new ShapeBorderDecorator(new Rectangle("red","yellow"));
		
		Shape circle = new ShapeBorderDecorator(new Rectangle("green","black"));
		
		line.draw();
		rectangle.draw();
		circle.draw();
	}
	
}
