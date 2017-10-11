package Inheritance;

// super class Variable access using Super and This Keyword

class Parent {
	int a=10;
	int b=20;
	
}
 class Child extends Parent{
	 int a=100;
	 int b=200;
	 void add(int a, int b){ //local variable
		 System.out.println(a+b);  //local
		 System.out.println(this.a+this.b); //current
		 System.out.println(super.a+super.b); //super
	 }
	 public static void main(String [] args){
		 new Child().add(1000,2000);
	 }

}
