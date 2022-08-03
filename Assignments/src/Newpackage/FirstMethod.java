package Newpackage;

public class FirstMethod {
		int a;
		

		public static void main(String[] args) {
			FirstMethod obj=new FirstMethod();
			System.out.println(obj.a);//it will print default value of int a
			int b=obj.a; //assigning value to local variable
			obj.Addition();
			System.out.println("I am back to main");
			obj.M1();
			System.out.println("I am back to main");
			obj.M2();
			obj.add(5,10);
			obj.add(25,35);
			obj.add(50,50);
			obj.add(125,100);

	}

	public void Addition() {
		System.out.println("I am addition");	
	}
	public void M1() {	
		System.out.println("I am M1");
		
	}
		
	protected void M2()	{
		System.out.println("I am M2");
		
		FirstMethod newobj=new FirstMethod();
		newobj.add(4,10);
		
	}

	public void add(int a,int b) {
	System.out.println(a+b);

	}
	public void M3(Float b) {

	}
	public void M4(int a, float b,boolean c) {
		
	}
	


	}


