public class PC {
	private RAM r;
	private Mouse m;
	private Speaker s;
	
	public PC(RAM a, Mouse m, Speaker s)
	{
		r=a;
		this.m=m;
		this.s=s;
	}

	public void print()
	{
		System.out.println("\nInformation about this PC's RAM");
		System.out.println("Its brand:"+r.getProductName());
		System.out.println("Its serial number:"+r.getSerial());
		System.out.println("Its manufacturer:"+r.getBrand());
		System.out.println("Its speed:"+r.getSpeed());
		System.out.println("\nInformation about this PC's Mouse:");
		System.out.println("Its product name:"+m.getProductName());
		System.out.println("Its serial number:"+m.getSerial());
		System.out.println("Its brand:"+m.getBrand());
		System.out.println("\nInformation about this PC's Speaker:");
		System.out.println("Its product name:"+s.getProductName());
		System.out.println("Its serial number:"+s.getSerial());
		System.out.println("Its brand:"+s.getBrand());
	}
}