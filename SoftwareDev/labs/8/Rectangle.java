package labs;

public class Rectangle extends Shape{
	   double length ;
	   double width ;
	   double area() {
	       return length * width ;
	   }
	  
	   public String toString() {
	       return "Rectangle [shapeName=" + shapeName + ", width=" + width + ", length=" + length + ", area=" + area()
	               + "]";
	   }
	  
	}