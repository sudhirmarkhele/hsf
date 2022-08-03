package Newpackage;

public class Switchpractic1 {

	public static void main(String[] args) {
		int a=12;
		if(a%2==0) {
			System.out.println("i am if even number");
			
		}else {
			System.out.println("i am odd number");
		}
		switch(a%2) {
		case 0:
			System.out.println("i am even number");
			break;
		case 1:
		System.out.println("i am odd number");
		break;

	}
	}
}
