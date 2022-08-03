package Newpackage;

public class Home {
	public int food;//Instance variable
	public static int refrigerator;// static variable

	public static void main(String[] args) {
int bed;
Home personone=new Home();
Home persontwo=new Home();
Home personthree=new Home();
Home Personfour=new Home();
Home personfive =new Home();
System.out.println(personone.refrigerator);
persontwo.refrigerator=25;
System.out.println("This is change value"+personone.refrigerator);
System.out.println(personthree.refrigerator);
Personfour.refrigerator=100;
System.out.println(persontwo.refrigerator);



	}

}
