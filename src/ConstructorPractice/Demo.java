package ConstructorPractice;

public class Demo {

	//variable declaration
		int a;
		String str;

		//zero argument constructor
		  Demo() {
			System.out.println("This is user defined zero argument constructor");
			a=10;
			str="30 april";
		}
		 
		 //With argument constructor
		 Demo(int c,String d){
			 System.out.println("This is with argument constructor");
			 a= c;
			 str=d;
			
		 }
		 
		 
		public void test() {
			System.out.println(a);
			System.out.println(str);
			
		}
		
		
		
		
		
	}

