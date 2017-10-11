package Inheritance;

class ParentInstance{
	
	{
		System.out.println("parent class ins block");
	}
	ParentInstance() {
	               
		System.out.println("Parent class 0-arg cons");
	}
	static 
	{
	   System.out.println("Parent class Static block");	
	}
}

public class ChildInstance extends ParentInstance{
	{
		System.out.println("Child class ins block");
	}
	ChildInstance() {
		System.out.println("Child class 0-args cons");
	}
	static
	{
		System.out.println("Child class static block");
	}
	public static void main(String[]args)
	{
		new ChildInstance();
	}

}
