package interfaceConcept;

public interface USBank {
	
	//In interface no method body , only method definition, phototype method
	 int min_bal = 100;
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body
	//only method prototype
	//in interface we can declare the variables, variables are by default static in nature 
	//variables value will not changed , it's final/constant in nature
	//no static method in interface
	//no main method in interface
	//we can not create object of an Interface
	//Interface is abstract in nature
}
