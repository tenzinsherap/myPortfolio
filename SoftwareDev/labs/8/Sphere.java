package labs;

public class Sphere extends Shape{
	   double radius ;
	   double area() {
	       return 4 * Math.PI * radius * radius ;
	   }
	  
	   public String toString() {
	       return "Sphere [shapeName=" + shapeName + ", radius=" + radius + ", Surface Area=" + area() + "]";
	   }
	  
	}
