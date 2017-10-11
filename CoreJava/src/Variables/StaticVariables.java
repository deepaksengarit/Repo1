package Variables;

public class StaticVariables {

	// Static variables
	static int a = 1000;
	static int b = 2000;

	// Static Method
	public static void main(String[] args) {
		// Static Area

		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);

		StaticVariables sv = new StaticVariables();

		sv.m1();
	}

	// Instance method
	void m1() {
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);

	}
}
