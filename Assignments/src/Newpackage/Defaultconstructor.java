package Newpackage;

public class Defaultconstructor {
	int a;
	int b;
	
public Defaultconstructor() {
	a=55;
	b=96;
	
	System.out.println("i am default constructor ");
}
	public static void main(String[] args) {
		Defaultconstructor obj=new Defaultconstructor();
		Defaultconstructor obj1=new Defaultconstructor();
		System.out.println("i am in defaultconstructor "+obj.a);
		System.out.println("i am in default constuctor " +obj.b);
		
	}

}
