package ConstructorPractice;

public class StudentMain {

	public static void main(String[] args) {
		//approach one:-initilization by using object
//		Student s = new Student();
//		s.rollno=101;
//		s.name="ABC";
//		s.grade='A';
//		s.display();
		
//		System.out.println("-----------------");
//		//approach two:-initilization by using method
//		Student s1=new Student();    //jvm==>default constructor
//		s1.getstudentdetails(201, "LMN", 'B');  //initilization
//		s1.display();
		
		//approach three:-constructor initilization with argument
		//initilization by using constructor
		Student s2=new Student(301,"XYZ",'c');
		s2.display();
		
		
		
		
		
		
		
	}
}
