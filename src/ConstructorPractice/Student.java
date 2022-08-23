package ConstructorPractice;

public class Student {

	//variable declaration
	   int rollno;
	   String name;
	   char grade;
	    
	   //user defined constructor==>with argument
	   Student(int rn,String nm,char c){
		   rollno=rn;
		   name=nm;
		   grade=c;
	   }
	   
	   //method
	   public void getstudentdetails(int rn,String nm,char c) {
		   rollno=rn;
		   name=nm;
		   grade=c;  
	   }
	   //printing the variable values
		public void display() {  //Variable usage
			System.out.println("The student roll no is:-"+rollno);
			System.out.println("The student name is:-"+name);
			System.out.println("The student grade is:-"+grade);
		}
}
