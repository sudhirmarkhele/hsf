package Newpackage;

public class IF_Else_IF {
	int a;

	public static void main(String[] args) {
		
//if value is less than 10 then print  i am less than 10
		//if value is greater than 10 and less than 20 then print i am greter than 10
		//if it is more than 20 print i am greater than 20
		
		
		 IF_Else_IF obj=new  IF_Else_IF();
		
		obj.a=26;
		
		if(obj.a<10) {
			System.out.println("im less than 10");
		}
		else if(obj.a>10 && obj.a<20) {
			System.out.println("im greter than 10 and less 20");
		
		}
		else if(obj.a<25) {
			System.out.println("im greter than 20");
		}else {
			System.out.println("im in onther else");
		}
	}

}
