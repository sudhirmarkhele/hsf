package Newpackage;

public class Logical_operators {

	public static void main(String[] args) {
	int var=5;//local variable, assignment operator.
	System.out.println("-----------AND CONDITION -----------");
	
	//TRUE && TRUE  THEN FINAL RESULT WILL BE TRUE.
	System.out.println("both condition is true so final result is true "  + ((5<6 || 0>1) && 5<1));
	System.out.println("first condition is false so final result is false "+(9>10 &&  5<8));
	System.out.println("second condition is false so final result is false " +(8>1 &&  9<4));
	System.out.println("both condition is  false so final result is false " +(8>15 &&15<5));

	System.out.println("-----------OR condition-------------");
	System.out.println("both condition is true so final result is true " +(1>0 || 5<10));
	System.out.println("first conidtion is false so final result is true "+(5<4  ||  15>4));
	System.out.println("second condition is false so final result is true "+(7>4 || 5<1));
	System.out.println("both condition is false so final result is false "+ (8>9 ||1<0));
	}

}
