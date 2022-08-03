package Newpackage;

public class Arithmatic_Operators1 {
int a=25;
public static int b;	

float c=30f;

	public static void main(String[] args) {
Arithmatic_Operators1 obj=new Arithmatic_Operators1();
Arithmatic_Operators1.b=obj.a;
int c=Arithmatic_Operators1.add(obj.a, Arithmatic_Operators1.b);
System.out.println(c);
float f=Arithmatic_Operators1.sub(11.5f, 22.5f);
System.out.println(f);
 double z=obj.multi(10.5, 5.5);
System.out.println(z);
long r=obj.div(40l, 4l);
System.out.println(r);
int v=obj.mod(5, 4);
System.out.println(v);


	}

	public static int add(int a, int b) {
		int c= a+b;
		return c;
		
	}
	public static float sub (float c, float d) {
	float f= c-d;
	return f;
	}
	
	double multi (double x, double y) {
		double z= x*y;
		return z;		
		
	}
	public long div (long p , long q) {
		long r=p/q;
		return r;	
		
	}
	
	protected int mod (int w, int u) {
		int v=w%u;
		return v;
			}
	
	
}
