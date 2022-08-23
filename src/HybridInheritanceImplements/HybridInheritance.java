package HybridInheritanceImplements;

public class HybridInheritance extends PQR implements B1,B2 {

	public void m3() {
		System.out.println("This is method m3 from B2 interface");
		}

		
		public void m2() {
		System.out.println("This is method m2 from B1 interface");
			
		}
	   public static void main(String[] args) {
		   HybridInheritance hi=new HybridInheritance();
		   hi.m1();
		   hi.m2();
		   hi.m3();
	}
}
