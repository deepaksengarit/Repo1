package Polymorphism;

//method overrriding in java

class parent {
	
	void marry() //overriden method
	{
		System.out.println("Red girl");
	}
}

class Child extends parent{
	
	void marry() //overriding method
	{
		System.out.println("White girl");
	}
	
	public static void main(String[] args)
	{
		new Child().marry();
	}
	
	

}
