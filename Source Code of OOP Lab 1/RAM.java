public class RAM {
	private String productname;
	private String serialnumber;
	private String brand;
	private String speed;
	
	public RAM(String a, String b, String c, String d)
	{
		productname=a;
		serialnumber=b;
		brand=c;
		speed=d;
	}

	public String getProductName()
	{
		return productname;
	}
	
	public String getSerial()
	{
		return serialnumber;
	}

	public String getBrand()
	{
		return brand;
	}

	public String getSpeed()
	{
		return speed;
	}
}