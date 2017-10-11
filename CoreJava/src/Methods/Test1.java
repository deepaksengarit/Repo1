package Methods;

public class Test1 {
	
	void m1(int a, char ch)
	{
		System.out.println("This is m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str,double d)
	{
		System.out.println("This is m2 method");
		System.out.println(str);
		System.out.println(d);
	}
	
	public static void main(String[]args)
	{
		Test1 t = new Test1();
		
		t.m1(10,'a');
		Test1.m2("deepak", 10.5);
		
	}

}
