public class TestApplication
{
	public static void main(String[] args)
	{
		Circle c = new Circle(10.0);
		Rectangle r = new Rectangle(12.0,12.0);
		Triangle t = new Triangle(5.0,5.0);
		Cone co = new Cone(3.0,3.0,3.0);
		Sphere sp = new Sphere(6.0);

		c.display();
		r.display();
		t.display();
		co.display();
		sp.display();

	}
}
