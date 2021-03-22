interface Speakable{
	public String speak();
}
class Animal{
	protected String kind;
	public Animal(){};

	public String toString(){
		return "I am a "+kind+" and I go "+((Speakable)this).speak();
	}
}

class Cat extends Animal implements Speakable{
	public Cat(){
		kind="cat";
	}
	public String speak(){
		return "meow";
	}
}

class Cow extends Animal implements Speakable{
	public Cow(){
		kind="cow";
	}
	public String speak(){
		return "moo";
	}
}

public class TestProgram{
	public static void main(String a[]){
		Animal cat = new Cat();
		System.out.println(cat.toString());
		Animal cow = new Cow();
		System.out.println(cow.toString());
	}
}