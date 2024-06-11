package sun.com;

public class userfn_ex {
	
	public static void add()
	{
		int a = 5;
		int b = 3;
		int total = a+b;
		System.out.println("Add:" +total);
	}
	
	public void sub(){
		{
			int a = 5;
			int b = 3;
			int total = a-b;
			System.out.println("Sub:" +total);
		}
		
	public int div()
	{
		int a = 5;
		int b = 3;
		int total = a/b;
		return total;
	}
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		add();
		
		userfn_ex obj = new userfn_ex();
		obj.sub();
		
		int result = obj.div();
		System.out.println("Division" +result);

	}

}
