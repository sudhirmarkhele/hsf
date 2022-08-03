package Newpackage;

public class methodoverloading {


	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading() ;
        int c=obj.add(10, 5);
        System.out.println(c);
        double d= obj.add(10.5, 25.6);
       System.out.println(d);
       double f=obj.add(10, 10.11)	;	       
        System.out.println(f);
	double g=obj.add(125.8, 25);
	System.out.println(g);
	double h=obj.add(10.5, 8, 9);
	System.out.println(h);
        int i=methodoverloading.add(10, 11, 13);
        System.out.println(i);
double j=methodoverloading.add(10.5, 5, 11.5);
        System.out.println(j);
        obj.add(10, 12.5f);
        double x=methodoverloading.add(10, 11.5, 22.5f);
        System.out.println(x);
        float y=methodoverloading.add(10, 10, 12.5f);
        System.out.println(y);
long t=obj.add(10l, 22l, 23l);
System.out.println(t);
        
	}
	
	public int add(int a, int b) {
		int c =  a+ b;
		return c;
	}

		public double add(double a , double b) {
			double d=a+b;
			return  d;				          

		}

		 

		public double add(int a , double b) {
			
			double f=a+b;
			
			return f;
		          

		}

		public double add(double a , int b) {
			
			double g= a+b;
			return g;

		}
		
         public double add(double a , int b,int c) {
			
			double h= a+b+c;
			return h;
         }		
		public static int add(int a, int b , int c) {
			
			int i=a+b+c;
			return i;
			
		}
		
		
		private static double add(double b, int a  ,double c) {
			
		double j= a+b+c;
		return j;
		
		}
		
		public void add(int b,float a) {
			float z=b+a;
			System.out.println("This is value of flaot z"  	  + z );
			
		}
		
			private static double add(int a, double b, float c) {
				
				double x= a+b+c;
				return x;
						
	}
			
			
		public static float add(int a, int b, float c)	{
			
			float y=a+b+c;
			return y;
			
			
		}
			public long add(long a,long b, long c) {
				
				long t=a+b+c;
				return t;
			}
			

				
				
				
				
				
			}
			
		

		

		



