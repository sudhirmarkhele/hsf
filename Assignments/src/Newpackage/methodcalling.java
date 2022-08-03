package Newpackage;

public class methodcalling {

	int a=5;
	int b=6;
	public static void main(String[] args) {
	
		String c = null;
		System.out.println("addition "+c);
	}public void  m1() {
		methodcalling obj=new methodcalling();	
		int c=obj.m2(5, 6);
		
	}
public int m2(int a,int b) {
	int c=a+b;
	return c;
	
	
	
	
}
}