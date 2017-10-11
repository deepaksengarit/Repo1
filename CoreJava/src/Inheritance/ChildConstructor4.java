package Inheritance;

class ParentConstructor4
{
    ParentConstructor4() {
	 System.out.println("Parent class 0 arg constructor.");
    }	
}

public class ChildConstructor4 extends ParentConstructor4{
	
	 /* code is genrated by compiler
	  * ChildConstructor4() {
		
		 super();
	}*/
   
	public static void main(String[] args)
	{
		new ChildConstructor4();
	}
}
