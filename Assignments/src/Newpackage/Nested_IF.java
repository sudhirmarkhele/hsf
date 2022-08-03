package Newpackage;

public class Nested_IF {

	
	public static int age=19;
	public static int wt=55;
	public static int ht=4;
	public static void main(String[] args) {
		
		if(age>18) {
			System.out.println("stage 1 is clear you are elegible for blood donation");
			
			if(wt>50) {
				System.out.println("check for height");
				
				
				}else {
					System.out.println("please try next time");
			}
			if(ht>5) {
				System.out.println("height is greter than 5");
			}else {
				System.out.println("heght is less than 5");
			}
		
		}	else {
			System.out.println("you are not eligible");
		}
		}
}