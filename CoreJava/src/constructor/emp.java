package constructor;

public class emp {
	// instance variable
	int eid; // 0
	String ename; // null
	float esal;// 0.0

	emp(int eid, String ename, float esal) // local variable
	{
		// conversion of local values to instance values
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	void disp() {
		System.out.println("emp id" + eid);
		System.out.println("emp name" + ename);
		System.out.println("emp sal" + esal);
	}

	public static void main(String[] args) {
		emp e = new emp(11, "deepak", 1000);
		e.disp();

		emp e1 = new emp(12, "vivek", 2000);
		e1.disp();
	}

}
