package Inheritance;

class ParentConstructor{
	
	ParentConstructor()
	{
		System.out.println(" parent class 0 arg constructor.");
	}
}

public class Childconstructor extends ParentConstructor {
	
	Childconstructor()
	{
		this(10);
		System.out.println(" child class o arg constructor");
	}
	Childconstructor(int a)
	{
		super();
		System.out.println(" child class 1 arg constructor.");
	}
	
	public static void main(String[]args)
	{
		new Childconstructor();
	}

}
