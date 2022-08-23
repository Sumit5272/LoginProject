package FinalInterfaceImplementation;

public class Test implements ABC {  //implementation class

	public void m1() {
		System.out.println(a);	
		}

		
		public void m2() {
			System.out.println(a);
		}

		
		public void sum(int x, int y) {
			System.out.println(x+y);
		}


		public int difference(int x, int y) {
			return (x-y);
		}
		
		public void mult() {
	     System.out.println( f*z);
		}	
	    
		public int div() {
			return f/z;
		}
		
		
		
		
		

		public static void main(String[] args) {
			
			Test t=new Test();
			t.m1();
			t.m2();
			t.sum(10, 10);
			System.out.println(t.difference(10, 10));
			t.mult();
			System.out.println(t.div());
			
			
			
			
			
		}
}
