package labs;

// JA: This should extend Circle
public class Cylinder extends Shape{
	   double radius ;
	   double height ;
	   double area() {
	       return Math.PI * radius * radius * height ;
	   }
	  
	   public String toString() {
	       return "Cylinder [shapeName=" + shapeName + ", height=" + height + ", radius=" + radius + ", Surface area=" + area()
	               + "]";
	   }
	  
	}