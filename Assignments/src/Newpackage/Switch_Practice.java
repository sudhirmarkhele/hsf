package Newpackage;

public class Switch_Practice {

	public static void main(String[] args) {
	char var='o';
	if(var=='a'|| var=='e'|| var=='i'||var=='o'|| var=='u') {
		
		System.out.println("charecter is owel "+'o');
		
	}

	switch(var) {
	case 'a':
		System.out.println("i am owel a");
		break;
	case 'e':
		System.out.println("i am owel e");
		break;
	case 'i':
		System.out.println("i am owel i");
		break;
	case 'o':
		System.out.println("i am owel o");
		break;
	case'u':
	System.out.println("i am owel u");
		default:
			System.out.println("i am not owel");
	}
		
	
	
	
	
	}

}
