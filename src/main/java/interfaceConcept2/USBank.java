package interfaceConcept2;

public interface USBank {
		
	int min_bal = 100; 
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void trading();
	
	
	/*
	 * No method body , only method declaration
	 * method prototype
	 * can not create object of interface
	 * no static method
	 * but interface  variables are static in nature by default
	 * 100 % abstraction
	 */

}
