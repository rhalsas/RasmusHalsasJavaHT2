





class Circle implements Shape{

	 public String borderColor = "pink";
	 public String fillColor = "red";
	public void draw(){
		System.out.print("\n"+"Draw Circle"  +"\n");
	}
	 public String getBorder(){
			return this.borderColor;
	}
	public String getFill(){
		return this.fillColor;
	}
	 public Circle(String fillColor, String borderColor)
	 {
		 this.fillColor = fillColor;
		 this.borderColor = borderColor;
	 }
	
}
