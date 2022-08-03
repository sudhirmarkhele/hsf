package Newpackage;

public class Constructer_Example {
int a;
int b;
	public static void main(String[] args) {
		Constructer_Example obj=new Constructer_Example();
		Constructer_Example obj1=new Constructer_Example();
		Constructer_Example obj2=new Constructer_Example();
		obj.M1();
		System.out.println("i am back in method");
		//class name object name=new constructor name();
		//new key word will do  memory allocation.
		
		//contructor will initialize value to instance variable
	}

public void  M1(){
	M2();//caller method M1 and calling method is M2.
	System.out.println("i am method m1");
	
}public void M2(){
	
	
}
}
