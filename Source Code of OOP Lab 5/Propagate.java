public class Propagate{
	public void method1(int i){
		try{
			method2(i);
		}
		catch(MyException e){
			e.printStackTrace();
		}
	}

	public void method2(int i)throws MyException{
		if(i==0)
			throw new MyException(i);
		else
			System.out.println("i: "+i);
	}

	public static void main(String[]a)
	{
		Propagate p = new Propagate();
		for(int i=0;i<3;i++)
			p.method1(i);
	}
}