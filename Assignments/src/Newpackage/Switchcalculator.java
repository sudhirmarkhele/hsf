package Newpackage;

public class Switchcalculator {

	public static void main(String[] args) {
	Switchcalculator obj=new Switchcalculator();
	
	int c=obj.add(5, 6);
	//System.out.println(c);
	int s=obj.sub(10, 5);
	System.out.println(s);
	int m=obj.multi(15, 16);
	System.out.println(m);
	int d=obj.div(15, 5);
	//System.out.println(d);
	int p=obj.mod(11, 2);
	//System.out.println(p);
	
	switch(p) {
	case 'c':
		System.out.println("this is addition " +c);
		break;
	case 's':
		System.out.println("This is  subtraction "+s);
		break;
		
	case 'm':
		System.out.println("this is multiplication " +m);
	
	case 'd':
		System.out.println("this is division " +d);
		break;
	case 'p':
		System.out.println("this is remainder");
		break;
		
	default:
		System.out.println("nothing");
	
	}
	
	
	
	
	
	}
public int add(int a, int b) {
	int c=a+b;
	return c;
	
	
}public int sub(int a,int b) {
	int s=a-b;
	return s;
}public int multi(int a,int b) {
	int m=a*b;
	return m;
	
}public int div(int a, int b) {
	int d=a/b;
	return d;
}public int mod(int a,int b) {
	int p=a%b;
	return p;
}
}
