


public class Line implements Shape{

	 public String borderColor = "pink";
	 public String fillColor = "red";
	 public Line(){
		 
	 }
	 public Line(String fillColor, String borderColor)
	 {
		 this.fillColor = fillColor;
		 this.borderColor = borderColor;
	 }
	 public String getBorder(){
			return this.borderColor;
	 }
	 public String getFill(){
		return this.fillColor;
	 }
	
	 public void draw(){
		System.out.print("\n"+"Draw Line"  +"\n");
	 }


	
}
