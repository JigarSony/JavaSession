package interfaceConcept2;

public class ICICIBank extends Finance implements RBI,USBank{
	
	//USBank Interface
	@Override
	public void debit() {
		System.out.println("icici  -- debit");
	}

	@Override
	public void credit() {
		System.out.println("icici -- credit");
	}

	@Override
	public void transferMoney() {
		System.out.println("icici -- transferMoney");
	}

	//RBIInterface
	@Override
	public void educationLoan() {
		System.out.println("icici -- educationLoan");
	}

	@Override
	public void carLoan() {
		System.out.println("icici -- carLoan");
	}

	@Override
	public void homeLoan() {
		System.out.println("icici -- homeLoan");
	}

	@Override
	public void trading() {
		System.out.println("icici -- trading");
	}
	
	//icici bank class methods
	public void mutualfunds() {
		System.out.println("icici -- mutualfunds");
	}
	
	public void insurance() {
		System.out.println("icici -- insurance");
	}

}
