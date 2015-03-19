
class Rectangle implements Shape {

	 public String borderColor = "pink";
	 public String fillColor = "red";
	public void draw(){
		System.out.print( "\n"+"Draw Rectangle"  +"\n");
	}
	 public String getBorder(){
			return this.borderColor;
	}
	public String getFill(){
		return this.fillColor;
	}
	 public Rectangle(String fillColor, String borderColor)
	 {
		 this.fillColor = fillColor;
		 this.borderColor = borderColor;
	 }
}
