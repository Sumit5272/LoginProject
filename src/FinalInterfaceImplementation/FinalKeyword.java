package FinalInterfaceImplementation;

public class FinalKeyword {

	final int speed=40;
	public static void main(String[] args) {
		
		FinalKeyword fk=new FinalKeyword();
		//fk.speed=50;   //you can not assign value when given final keyword to declaration
		System.out.println(fk.speed);  //40
		
	}
}
