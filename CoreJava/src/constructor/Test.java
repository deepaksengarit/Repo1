package constructor;

public class Test {

	void m1() {
		System.out.println("m1 method");
	}

	// user defined cons
	Test() {
		System.out.println("0-argument constructor");
	}

	Test(int a) {
		System.out.println("1-argument constructor");
	}
	Test(int a,int b) {
		System.out.println("2-argument constructor");
	}

	public static void main(String[] args) 
	{   // named approach
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test(10,20);
		
		//name less approach
		new Test();
		new Test(10);
		new Test(10,20);
		

	}

}
