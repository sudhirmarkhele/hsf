package Newpackage;





public class Arithmatic_Operators {

	public static void main(String[] args) {
		Arithmatic_Operators obj=new Arithmatic_Operators();
		
        int c=  obj.add(10, 15);
        System.out.println(c);
        
        int z= Arithmatic_Operators.sub(25, 5);
        System.out.println(z);
        
        double r= obj.multi(15.5, 25.5);
        System.out.println(r);
        float f=obj.div(70.5f, 11.5f);
        System.out.println(f);
        
        int m= Arithmatic_Operators.mod(80, 15);
        System.out.println(m);
	}

	public int add(int a, int b) {
		
		int c= a+b;
		return c;
		
	}
	
	public static int sub(int x ,int y) {
		int z=x-y;
		return z;		
		
	}
	 double multi(double p,  double q) {
		 
		 double r=p*q;
		 
		 return r;		 
		 
	 }
	
	 public float div(float d,  float e) {
		 
		 float f=d/e;
		 
		 return f;
	 }	
		 
public static int mod(int a, int b) {
	int m= a%b;
	
	return m;
	
}
		 
		 
	 }
	 
	 

