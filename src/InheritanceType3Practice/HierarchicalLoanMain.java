package InheritanceType3Practice;

public class HierarchicalLoanMain {

	public static void main(String[] args) {
		
		HLoan hl=new HLoan();
		hl.name("ABC LMN PQR");
		hl.age();
		hl.birthday();
		hl.birthmonth();
		hl.birthyear();
		hl.nationality();
		hl.mobileno();
		hl.adharcard();
		hl.pancard();
		hl.bankpassbook();
		hl.coapplicantname();

		hl.bunglow();
		hl.newflat();
		hl.oldflat();
		System.out.println("------------------------------");

		PLoan pl=new PLoan();
		pl.name("LOAN LOAN LOAN");
		pl.age();
		pl.birthday();
		pl.birthmonth();
		pl.birthyear();
		pl.nationality();
		pl.mobileno();
		pl.adharcard();
		pl.pancard();
		pl.bankpassbook();
		pl.coapplicantname();

		pl.loanIntrest();
		System.out.println("--------------------------");

		VLoan vl=new VLoan();
		vl.name("WED FGH YUT");
		vl.age();
		vl.birthday();
		vl.birthmonth();
		vl.birthyear();
		vl.nationality();
		vl.mobileno();
		vl.adharcard();
		vl.pancard();
		vl.bankpassbook();
		vl.coapplicantname();

		vl.twowheeler();
		vl.threewheeler();
		vl.fourwheeler();
		vl.Sixwheeler();

		}
	

}

