package Newpackage;

public class Default_Constructor {
int p;
int q;
	
//constructor is similar to method but it is not a Method
//Constructor name is same as class name.

//Constructor dosen't have return type

  public Default_Constructor() { 
	 p=10;
	 q=25;
		System.out.println("i am in constructor");
  }
		// below method is having void return type so it is not a constructor
		public void Default_Constructor() {
		p=25;
			q=35;
		}
	
	public static void main(String[] args){
	
		Default_Constructor objectname=new Default_Constructor();
		Default_Constructor newobj=new Default_Constructor();
		
		
		System.out.println("default value of p "+objectname.p);
		System.out.println("default value of q  "  +objectname.q);
		System.out.println("default value of p " +newobj.p);
		System.out.println("default value of q "  +newobj.q);
	}

}
