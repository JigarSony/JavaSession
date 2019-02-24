package abtractionConcept;

public abstract class Bank {
	
	//both abstract class and interface are use to archive abstraction
	
	//abstract doesn't provide any business logic
	//abstract provide only feature/overview
	
	/*
	 * IN abstract class put abstract keyword to define abstract class
	 * In this class at least one method should be there
	 * which is abstract in nature
	 * abstract method : means only photo type
	 * Only method declaration 
	 * No method body
	 */
	
	/*
	 *it can have any kind of variable static, non static, final, non final  
	 */
	
	int amount = 100;
	final int rate = 10;
	static int loanrate = 5;
	
//	public abstract void loan() {
//		
//	}
	//Not Allowed
	
	//allowed
	public abstract void loan();
	
	//abstract class contains at least one abstract method compulsory
	//then you can create abstract method as well non abstract method as well
	
	/*Abstraction Means: To hide some implementation logic
	 * Implementation define by respective child classes
	 */
	
	//non abstract method
	public void credit() {
		System.out.println("Bank -- credit");
	}
	
	public void debit() {
		System.out.println("Bank -- debit");
	}
	
	/*
	 * here 1 method is abstract and 2 are non abstract
	 * through this we are achieving partial abstraction
	 */
	
	/*
	 * When to use Abstract class and interface
	 *	Partial abstraction - abstract class
	 *	Fully abstraction - interface
	 */
	
	/*
	 * Performance wise abstract class is faster than interface
	 */
}
