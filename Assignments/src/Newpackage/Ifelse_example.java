package Newpackage;

public class Ifelse_example {

	//if number is greater than 5 and less than 10 then print
	//if number is  greter than 10 and less than 15 then print
	
	public static void main(String[] args) {
int var=10;
int a=20;
int b=1;



if(var>5 && var<=10) {
	  System.out.println("number is greter than 5 and less than 10");
}
      
      else {
    	  System.out.println("hmm");
      }
      if(var>10 && var<15) {
    	  System.out.println("number is greter than 10 and less than 15");
      }

      else {
    	  System.out.println("hmm1");

	}
      if (a>6) {
    	  System.out.println("im inside the if loop");
    	  
      }else {
    	  System.out.println("im in else");
      }
      if(b<1) {
    	  System.out.println("im inside if loop");
    	  
      }else {
    	  System.out.println("im in else");
      }
	}
}
