
package Inheritance;

class ParetnConstructor2{
	
	ParetnConstructor2(int a)
	{
		System.out.println("Parent class 1 arg constructor");
	}
}

public class ChildConstructor2 extends ParetnConstructor2{
	
	public ChildConstructor2() {
		super(10);
		System.out.println("Child class 0 arg constructor");
	}
	
	public static void main(String[]args)
	{
		new ChildConstructor2();
		
	}

}
