package Variables;

public class InstanceVariables {

	// instance variables

	int a = 100;
	int b = 200;

	// static method
	public static void main(String[] args) // main method
	{
		// static area
		InstanceVariables t = new InstanceVariables();

		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();

	}

	// instance method
	void m1() // user method
	{
		// instance area

		System.out.println(a);
		System.out.println(b);

	}
}
