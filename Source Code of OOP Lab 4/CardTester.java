abstract class Card{
	private String recipient;

	Card(String recipient){
		this.recipient = recipient;
	}

	public abstract void greeting();

	public String returnRecipient(){
		return recipient;
	}
	public void changeRecipient(String r){
		recipient = r;
	}

}

class Wedding extends Card{
	String partners;

	public Wedding(String name, String partners)
	{
		super(name);
		this.partners = partners;
	}
	public void greeting(){
		System.out.println("Dear "+super.returnRecipient()+" and "+"partners");
		System.out.println("Happy Wedding!");
	}

}

class KadRaya extends Card{
	
	public KadRaya(String name)
	{
		super(name);
	}

	public void greeting(){
		System.out.println("Dear "+super.returnRecipient()+",\n");
		System.out.println("Selamat Hari Raya!\n");
	}
}

class Birthday extends Card{
	int age;

	public Birthday(String r,int years)
	{
		super(r);
		age = years;
	}

	public void greeting(){
		System.out.println("Dear "+super.returnRecipient()+",\n");
		System.out.println("Happy"+age+"th Birthday!\n");
	}
}

public class CardTester{
	public static void main(String a[]){
		Card raya = new KadRaya("Ali");
		Card birthday = new Birthday("Abu",22);

	}
}

