package oopConceptPart3;

public class TestBank {

	public static void main(String[] args) {
		 
		//we can not create object of interface
		//USBank b = new USBank();
		//Cannot instantiate the type USBank
		
		//static poly
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoab();
		hs.carLoan();
		
		//dynamic poly
		//child class object can be referred by parent Interface reference var
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	
		System.out.println(USBank.min_bal);
		
		//The final field USBank.min_bal cannot be assigned
		//USBank.min_bal = 200; 
		
	}

}
