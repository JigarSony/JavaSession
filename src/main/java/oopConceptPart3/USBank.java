package oopConceptPart3;

public interface USBank {
	
	//In interface no method body , only method defination,protptype method
	 int min_bal = 100;
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body
	//only method prototype
	//in interface we can declare the variables, vars are by default static in nature 
	//vars value will not changed , it's final/const in nature
	//no static method in interface
	//no main method in interface
	//we can not create object of an Interface
	//Interface is abstract in nature
}
