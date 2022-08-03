package Newpackage;

public class LifeWithoutMethod {

	private char[] c;


	public static void main(String[] args) {
	int a=5;
	int b=10;
	int c=a+b;
	System.out.println("Addition of two numbers " +c);
	a=25;
	b=35;
	c=a+b;
	System.out.println("Adiition of two numbers"+ c);
	a=50;
	b=50;
	c=a+b;
	System.out.println("Addition of two numbers" + c);
	int d=c+5;
	System.out.println("d value" +d);
	a=125;
	b=100;
	c=a+b;
	System.out.println("Addition of two numbers "+ c);
	}

	
//these four lines are duplicate so create one method with name method
public void Addition() {
	int a=5;
	int b=10;
	int c=a+b;

	
	//Method Syntax
	//<Access_Modifier> void <Identifier>(){
    //Method Body
//}


	
	
}

}
