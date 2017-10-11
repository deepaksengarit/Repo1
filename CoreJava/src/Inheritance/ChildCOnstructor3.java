package Inheritance;

class ParentCOnstructor3{
	
	ParentCOnstructor3()
	{
		System.out.println("Parent class 0 arg constructor");
	}
}

public class ChildCOnstructor3 extends ParentCOnstructor3{
	
	ChildCOnstructor3() {
		
        //super(); compiler genrated code       
		System.out.println("Child class 0 arg constructor");
           
	}
	
	ChildCOnstructor3(int a)
	{
		//super(); compiler genrated code
		System.out.println("Child class 1 arg constructor.");
	}
	
	public static void main(String[]args)
	{
		new ChildCOnstructor3();
		new ChildCOnstructor3(10);
	}

}
