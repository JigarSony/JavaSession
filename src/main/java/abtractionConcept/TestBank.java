package abtractionConcept;

public class TestBank {

	public static void main(String[] args) {
		 
		HDFCBank hd = new HDFCBank();
		
		hd.credit();
		hd.debit();
		
		hd.loan();
		
		hd.funds();
		
		
		//dynamic polymorphism
		Bank b = new HDFCBank();
		b.debit();
		b.credit();
		b.loan();
		
		//through this we can call all the overridden method as well as inherited method also
		
		//Bank b1 = new Bank();
		//not allowed
		//cannot create the object of abstract class

		/**
		 * output:
		 * Bank -- credit
		 * Bank -- debit
		 * HDFC -- Loan Method
		 * HDFC -- Funds
		 * Bank -- debit
		 * Bank -- credit
		 * HDFC -- Loan Method
		 */

	}

}
