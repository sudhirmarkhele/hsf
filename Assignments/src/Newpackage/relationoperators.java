package Newpackage;

public class relationoperators {
	int c=5;
	int d=6;

	public static void main(String[] args) {
		relationoperators obj=new relationoperators();
	boolean d=obj.equalTo(5, 6);
	System.out.println(d);
		int a=5;
		int b=6;
		System.out.println("checking wheather a and b is equal  " +(obj.c==obj.d) );
		System.out.println("checking wheather a is not equal to b "+ (a!=b));
		System.out.println("checking wheather a is less than b " + (a<b));
		System.out.println("checking wheather a is  less than equlat to b " + (a<=b));
		System.out.println("checking wheathe a is greater than b " + (a>b));
System.out.println("checking wheather a is greater than equal to b " + (a>=b));
	
	}
public boolean equalTo(int a, int b) {
	 boolean d = a==b;
	 return d;
	
	
}
}
