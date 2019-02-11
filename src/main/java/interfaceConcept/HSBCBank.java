package interfaceConcept;

public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inheritance 
	//Is-A relation ship
	
	//same method name from interface
	//If a class is implementing any Interface,then its mandatory to define/overridden all the method of interface.
	
	//overriding from usbank
	public void credit() {
		System.out.println("Hsbc--credit");
	}

	public void debit() {
		System.out.println("Hsbc--debit");
	}

	public void transferMoney() {
		System.out.println("Hsbc--transferMoney");
	}
	
	//seperate method of hsbcclass
	public void educationLoab() {
		System.out.println("HSBC -- Edu Loan");
	}

	public void carLoan() {
		System.out.println("HSBC -- Car Loan");
	}

	//overriding from brazil bank method
	public void mutualFund() {
		System.out.println("hsbc -- mutualFund");		
	}
}
