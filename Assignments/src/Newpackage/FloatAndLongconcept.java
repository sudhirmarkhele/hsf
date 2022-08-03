package Newpackage;

public class FloatAndLongconcept {
	public float var1=12;// cosidered as double and 8 byte memory is allocated
	public long var2=2147483648l;
	public float var3= 12f;//cosidered as float and 4 byte memory is allocated
	

	public static void main(String[] args) {
		FloatAndLongconcept obj=new FloatAndLongconcept();
		System.out.println("float value" +obj.var1);
		System.out.println("Hello word" + obj.var2);
		System.out.println("float value " + obj.var3);
		

	}

}
