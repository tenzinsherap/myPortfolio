//package labs;


public class Triangle {
	private double side1; 
	private double side2; 
	private double side3; 
	
	
	// constructor
	public Triangle()
	
	{
		
	}
	
	public Triangle(double s1, double s2, double s3)
	throws IllegalTriangle
	{
		side1= s1; 
		side2=s2; 
		side3=s3; 
		
		// catch 
		try 
		{
			if ((side1+side2)<side3 ||
					(side2+side3)<side1||
					(side1+side3) <side2)
				throw new IllegalTriangle();
			
		}
		catch(IllegalTriangle ex)
		{
	System.out.println(ex); 
		}
	}
	public double getSide1()
	{ return side1; 
	} 
	
	public double getSide2()
	{ return side2; 
	
	}
	public double getSide3()
	{ return side3;
			
	}
	
	public double getArea() {
		double s = (side1+side2+side3)/2; 
		double area = s *(s-side1)*(s-side2)*(s-side3); 
		return area; 
	}
	
	public double getPerimeter() { 
		return (side1+side2+side3);
	}
	
	public String toString() { 
		return "Triangle: side1= " +side1+ " side2= " +side2+ " side3= " +side3; 
	} 
	

}