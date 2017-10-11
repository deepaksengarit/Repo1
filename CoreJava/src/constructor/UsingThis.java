package constructor;

public class UsingThis {

	UsingThis() {
		this(10);
		System.out.println("0 argument constructor");
	}

	UsingThis(int a) {
		this(10, 20);
		System.out.println("1 argument constructor");
	}

	UsingThis(int a, int b) {
		System.out.println("2 argument constructor");
	}

	public static void main(String[] args) {
		UsingThis u = new UsingThis();
	}

}
