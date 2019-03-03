package interfaceConcept2;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic = new ICICIBank();
		
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		
		ic.credit();
		ic.debit();
		ic.trading();
		ic.transferMoney();
		
		
		ic.insurance();
		ic.mutualfunds();
		
		ic.stock();
		
		System.out.println(USBank.min_bal);
		
		USBank us = new ICICIBank();
		//can not create reference of interface
		//we have create child class object that reference of interface
		
		us.credit();
		us.debit();
		us.trading();
		us.transferMoney();
		
		//unable to do that
		//it's from RBI
//		us.educationLoan();
//		us.homeLoan();
//		us.carLoan();
		
		//unable to do that
		//it from icici 
//		us.insurance();
//		us.mutualfunds();
	}

}
