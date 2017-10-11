
// to represent instance var use this keyword
package Methods;

public class Test2 {
	
	//instance variable
	int x=100;
	int y=200;
	
	void add(int x,int y) //local variable
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	public static void main(String[]args)
	{
		Test2 t = new Test2();
		
		t.add(1000, 2000);
	}
}
