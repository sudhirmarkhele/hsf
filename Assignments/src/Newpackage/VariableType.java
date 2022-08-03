package Newpackage;

public class VariableType {
	
	
	public int food;
	public static int refrigerator;

	public static void main(String[] args) {
	
		int a;
		VariableType dhananjay=new VariableType();
		VariableType Shubham=new VariableType();
		System.out.println("static variable value"+ VariableType.refrigerator);
		System.out.println("Static variable value" + Shubham.refrigerator);
		dhananjay.refrigerator=35;
		System.out.println("Static variable value for dhananjay" + dhananjay.refrigerator);
		System.out.println("Static variable value changed for Shubham as well" +  Shubham.refrigerator);
		System.out.println("Food instance variable value for dhananjay" +dhananjay.food);
		System.out.println("Food instance variable value foe Shubham" + Shubham.food);
		dhananjay.food=10;
		//as food is instance variable value only change for dhananjay but not for Shubham
		System.out.println("Food instance variable value for dhananjay" + dhananjay.food);
		System.out.println("Food instance variable vakue for Shubham"  + Shubham.food);
		//Local varible is mandatory to initilize before use;
		a=10;// if try to use before initilize we will get eroor 
		System.out.println(a);
                                                                            
	}
                 
}
