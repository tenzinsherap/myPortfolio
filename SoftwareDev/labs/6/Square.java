package labs;

class Square {
	private double width;

	   public Square() {
	       width = 1;
	   }

	   /**
	   * @param constructor
	   */
	   public Square(double s) {
	       width = s;
	   }

	   public double getArea() {
	       return width*width;
	   }
	   public double getPerimeter() {
	       return 4*width;
	   }

	   // returning object details
	   public String toString() {
	       return "Length : " + width + "\nWidth : " + width + "\nArea : "+getArea()+"\nPerimeter : "+getPerimeter();
	   }

	   public double getWidth() {
	       return width;
	   }

}
