package CastingPractice;

public class ImplicitCastingPractice {

	public static void main(String[] args) {
		
		byte b=50;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("byte :-"+b);
		System.out.println("short :-"+s);
		System.out.println("int :-"+i);
		System.out.println("long :-"+l);
		System.out.println("float :-"+f);
		System.out.println("double :-"+d);
}
}