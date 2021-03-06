public class Square extends Rectangle
{
	double height;

	public Square()
	{
		super(10,15);
		height = 10;
	}

	public double calculateVolume()
	{
		return calculateArea()*height;
	}

	public void display()
	{
		super.display();
		System.out.println(height);
		System.out.println(calculateVolume());
	}
}