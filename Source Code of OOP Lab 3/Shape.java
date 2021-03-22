public class Shape
{
	private double area;

	public void setArea(double a)
	{
		area=a;
	}

	protected double getArea()
	{
		return area;
	}
}

class Circle extends Shape
{
	private double radius;

	public Circle(double r)
	{
		radius=r;
	}

	protected double getArea()
	{
		return radius*radius*Math.PI;
	}

	protected void setRadius(double r)
	{
		radius = r;
	}

	protected double getRadius()
	{
		return radius;
	}


	public void display()
	{
		System.out.println("Area of circle with radius of "+ radius+" = "+Math.round(getArea() * 100.0) / 100.0);
	}
}

class Rectangle extends Shape
{
	private double width;
	private double length;

	Rectangle(double _w,double _l)
	{
		width=_w;
		length=_l;
	}

	public double getArea()
	{
		return width*length;
	}

	public void display()
	{
		System.out.println("Area of rectangle with width of "+width+" and length of "+length+" = "+Math.round(getArea() * 100.0) / 100.0);
	}
}

class Triangle extends Shape
{
	private double height;
	private double base;

	Triangle(double _h,double _b)
	{
		height=_h;
		base=_b;
	}

	protected double getArea()
	{
		return ((height*base)/2);
	}

	public void display()
	{
		System.out.println("Area of triangle with height of "+height+" and base of "+base+" = "+Math.round(getArea() * 100.0) / 100.0);
	}
}

class Cone extends Circle
{
	private double height;
	private double slant_height;

	public Cone(double r, double h, double s)
	{
		super(r);
		height=h;
		slant_height=s;
	}

	protected double getArea()
	{
		return (super.getArea()+(slant_height*getRadius()*Math.PI));
	}

	public void display()
	{
		System.out.println("Area of cone with radius of "+getRadius()+" ,height of "+height+" and slant height of "+slant_height+" = "+Math.round(getArea() * 100.0) / 100.0);
	}
}

class Sphere extends Circle
{
	
	public Sphere(double r)
	{
		super(r);
	}

	protected double getArea()
	{
		return (4*super.getArea());
	}

	public void display()
	{
		System.out.println("Area of sphere with radius of "+getRadius()+" = "+Math.round(getArea() * 100.0) / 100.0);
	}
}