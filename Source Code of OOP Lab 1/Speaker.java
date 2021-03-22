public class Speaker {
	private String productname;
	private String serialnumber;
	private String brand;
	
	public Speaker(String a, String b, String c)
	{
		productname=a;
		serialnumber=b;
		brand=c;
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
}