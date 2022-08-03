package Newpackage;

public class multiplicationoffloat {
float b=4.5f;
float c=5.7f;

	public static void main(String[] args) {
		multiplicationoffloat obj=new multiplicationoffloat();
float d=obj.multi(obj.b, obj.c);
System.out.println(d);
	}public float multi(float b, float c) {
		
	float d=b*c;
	return d;
			
	}

}
