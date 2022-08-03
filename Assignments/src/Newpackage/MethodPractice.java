package Newpackage;

public class MethodPractice {
	
	public int var1; //instance variable
	public static  int var3;  //static variable
	int var4=5;// instance variable // declaration+initialization
	static MethodPractice obj;//declaration
	private float var2;
	
	
	//Syntax of Method
	//<Aceess Modifier> <Non Access modifier> <Return Type> <Method Name>(){
	
	//method body
	//}
	
	//instance  method which is returning char value
	protected char m2() {
		System.out.println("i am from m2");
		return 'p';
		
	}
// static method which is not returning any value
	private static void m3() {
  System.out.println("i am from m3");	
		
	}
	
	  public static int m4() {
		System.out.println("I am from m4"); 
		return 1;
				  
	  }
	  // instance method which is not returning any value
	  private void m1() {
		  System.out.println("i am from m1");
		  
		  
	  }
	  
	public static void main(String[] args) {
int a; //local method 
MethodPractice.m3();// called by using class name
m4();
MethodPractice obj1=new MethodPractice();

obj1.m1();
obj1.m2();

	
	}

}
