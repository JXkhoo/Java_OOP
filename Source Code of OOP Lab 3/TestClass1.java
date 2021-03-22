public class TestClass1
{
	public static void main(String[] args)
	{
		A a = new A();
		a.p(10);
	}
}

class B
{
	public void p(int i)
	{
		System.out.println(i + " in Class B ");
	}
}

class A extends B
{
	public void p(int i)
	{
		System.out.println(i + " in Class A ");
	}
}