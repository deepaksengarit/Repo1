package Inheritance;

public class A {
	
	void m1(){ System.out.println("m1 method");}
	void m2(){System.out.println("m2 method");}
	 public static void main (String [] args){
		  
		  A a = new A();
		  a.m1(); a.m2();
		  
		  B b = new B();
		  b.m1(); b.m2();b.m3();b.m4();
		  
		  C c = new C();
		  c.m1(); c.m2(); c.m3(); c.m4(); c.m5(); c.m6();
		  
		  
			
			
		}
}
	class B extends A{
		void m3(){System.out.println("m3 method");}
		void m4(){System.out.println("m4 method");}
	}
	class C extends B{
		void m5(){System.out.println("m5 method");}
		void m6(){System.out.println("m6 method");}
	
 
}
