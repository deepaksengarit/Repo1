package Methods;

public class Test3 {
	
	int a=100;
	int m1(int a)
	{
		System.out.println("m1 method");
		return a;
	}
	public static void main(String[]args)
	{
		Test3 t= new Test3();
		
		int x = t.m1(10);
		System.out.println("method return value"+x);
	}

}
