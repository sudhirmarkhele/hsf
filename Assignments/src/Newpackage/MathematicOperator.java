package Newpackage;

public class MathematicOperator {

	public static void main(String[] args) {
MathematicOperator obj=new MathematicOperator();

int c=obj.add(44, 55);
System.out.println(c);
float d= obj.add(77, 75f);
System.out.println(d);

	}
public int add(int a, int b) {
	
	int c =a+b;
	return c;
	
}
public float add (int a, float b) {
	
	float d= a+b;
	return d;
	
}

}

