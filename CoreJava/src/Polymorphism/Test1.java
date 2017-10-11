package Polymorphism;

public class Test1 {
	
	//Constructor overloading
	
	Test1(int a)
	{
		System.out.println("int arg cons");
	}
	Test1(int a,int b)
	{
		System.out.println("int,int arg cons");
	}
    Test1(char ch)
    {
    	System.out.println("ch arg cons");
    }
    public static void main(String[]args)
    {
    	new Test1(10);
    	new Test1(10, 20);
    	new Test1('a');
    }
}
