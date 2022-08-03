package Newpackage;

//static and non static variable need to declare within the class and outside the method
//local variable need to declare within the method


public class datatype {
public byte var1;
public short var2;
public int var3;
public long var4;
public char var5;
public boolean var6;
public float var7;
public double var8;
//static variable ,static word is used
public static int var9;
public void add() {
// local variable declaration and initilisation
int var11=80;
System.out.println(var11);

}	public static void main(String[] args) {
		
//to call or use instance variable ,we can do through object
	
	datatype obj=new datatype();
	System.out.println("This is begining of program");
	System.out.println("This is default value of var1 is"  + obj.var1);
	System.out.println("This is default value of var2 is"  + obj.var2);
	System.out.println("This is default value of var3"  +  obj.var3);
	System.out.println("This is default value of var4" +  obj.var4);
	System.out.println("This is default value of var5"  + obj.var5);
	System.out.println("This is default value of var6"   + obj.var6);
	System.out.println("This is default value of var7"   + obj.var7);
	System.out.println("This is default value of var8"   + obj.var8);
	System.out.println("This is default value of var9"  + datatype.var9);
	//accessing static variable through class name
	System.out.println("accessing static variable through instance"+ obj.var9);
	//accessing static variable through object name
	//accessing static variable directly as main methos is static no need to call using class name
	System.out.println("I am accessing static variable direcly" + var9);
	obj.var1=15;
	obj.var2=obj.var1;
	System.out.println("var1" + obj.var1);
	System.out.println("var2" + obj.var2);
	
	/*
	 * obj.var1=obj.var2; //down casting/narrow casting not recommended
	 */System.out.println("var" +obj.var1);
	 
	 
	 
	
	}

}
