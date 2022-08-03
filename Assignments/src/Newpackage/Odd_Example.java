package Newpackage;

public class Odd_Example {

	public static int var;
	
	public static void main(String[] args) {
		Odd_Example.var=5;
		 Odd_Example obj =new  Odd_Example();
		 obj.Oddeven(var);
		if(var%2==0) {
			System.out.println("Number is Even " +var);		
		}else{
			System.out.println("number is odd " +  var);
		}

	}
	

	private void Oddeven(int a) {
		if(a%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	
	}
}
