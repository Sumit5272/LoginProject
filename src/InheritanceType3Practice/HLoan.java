package InheritanceType3Practice;

public class HLoan extends Loan{

	public void bunglow() {
		System.out.println("Loan required above 1 cr");
		System.out.println("Rate of intrest 6.75 %");
	}
	
	public void newflat() {
		System.out.println("Loan required below 1 cr");
		System.out.println("Rate of intrest 7.75 %");
	}
	
	public void oldflat() {
		System.out.println("Loan required below 90 lakhs");
		System.out.println("Rate of intrest 7.50 %");
	}
}
