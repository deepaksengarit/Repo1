package Methods;

public class Test3Case1 {
	
	int a=100;
	
	int m1(int a)
	{
		System.out.println("m1 method");
		
		return this.a;
	}
	public static void main(String[]args)
	{
		Test3Case1 t=new Test3Case1();
		
		int x=t.m1(10);
		System.out.println("method return value is "+x);
	}

}
