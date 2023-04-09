public class Circle {
	
	private double radius=1.0;
	
	private String color="red";
	
	
	
	public Circle() {
	
	radius=1.0;
	
	color="red";
	
	}
	
	
	
	public Circle(double radius)
	
	{
	
	this.radius = radius;
	
	color="red";
	
	}
	
	
	
	public double getRadius()
	
	{
	
	return radius;
	
	}
	
	
	public String toString()
	
	{
	
	return "radius=" + radius + ", color=" + color ;
	
	}
	
	
	
	public double getArea() {
	
	return Math.PI*getRadius()*getRadius();
	
		}
	
	}
	public class TestCylinder extends Circle
	
	{
	
	private double height=1.0;
	
	
	public TestCylinder()
	
	{
	
	//invoking super class constructor
	
	super();
	
	height=1.0;
	
	}
	
	
	
	public TestCylinder(double radius)
	
	{
	
	
	super(radius);
	
	height=1.0;
	
	}
	
	
	
	public TestCylinder(double radius,double height)
	
	{
	
	
	super(radius);
	
	this.height = height;
	
	}
	
	
	public double getHeight()
	
	{
	
	return height;
	
	}
	
	
	
	public double getArea()
	
	{
	
	double surfaceArea=2*Math.PI*getRadius()*height+2*Math.PI*getRadius()*getRadius();
	
	return surfaceArea;	
	}
	
	public double getVolume()
	
	{
	
	
	return super.getArea()*height;
	
	}
	
	@Override
	
	public String toString()
	
	{
	
	return super.toString() + ", height=" + height ;
	
	}
	
	}