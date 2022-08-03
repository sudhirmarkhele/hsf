package Newpackage;

public class Arithmaticoperatorspractice {

	public static void main(String[] args) {
		
	Arithmaticoperatorspractice obj=new Arithmaticoperatorspractice();
	float c=Arithmaticoperatorspractice.add(5, 9);
	System.out.println(c);
int d=	obj.sub(44, 96);
	System.out.println(d);
	obj.multi(155.5, 895.5);

int f=	obj.div(75, 12);
	System.out.println(f);
	float m=obj.mod(75f, 790f);
	System.out.println(m);
	
	
	

	}
	
	public static float add(int a, float b) {
		
		float c=a+b;
		return c;	
	}
private int sub (int a, int b) {
	int d= a-b;
	return d;
	
	
}
protected void multi (double d, double e) {
	double g=d*e;
	System.out.println(g);
	
	
}
int div (int a, int b) {
	int f= a/b;
	return f;
}
public float mod(float f, float h) {
	float m=f%h;
	return m;
	
}
}
