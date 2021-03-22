public class PCTest {
	public static void main(String[] args)
	{
		RAM r1=new RAM("Corsair","A12345","Samsung","IG");
		Mouse m1=new Mouse("Creative Labs FreePoint","7300000000245","Creative Labs");
		Speaker s1=new Speaker("Logitech Speaker","56851451511","Logitech");
		PC p1=new PC(r1,m1,s1);
		p1.print();
	}
}