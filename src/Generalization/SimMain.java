package Generalization;

public class SimMain {

	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.internet();
		a.calling();
		a.sms();
		System.out.println("-------------------");
		
		Jio j=new Jio();
		j.internet();
		j.calling();
		j.sms();
		j.AmazonPrime();	
		
	}
}
