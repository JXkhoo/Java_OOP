public class MyException extends Exception{
	private int value;
	private String msg;

	public MyException(int i){
		value = i;
		msg = new String("Exception happens at value: "+value);
	}

	public String getMessage(){
		return msg;
	}
	public void printStackTrace(){
		System.out.println("The problem is with the value: "+value);
	}
}