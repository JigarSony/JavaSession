package exceptionHandligConcept;

public class ThrowsKeyword {

	public static void main(String[] args)  {
			//throws ArithmeticException {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Hi");
	}
	
	/*
	 * Is also used to handle exception
	 * But not report anything
	 * When we have method chaining
	 * Here div to sum to main and main will give to JVM
	 * JVM will accept the particular exception
	 * Program will terminated
	 * Unable to print own message
	 * JVM will print print stack some message
	 */
	
//	public void sum() throws ArithmeticException{
//		div();
//	}
	
	public void sum() {
		try{
			div();
		}catch(ArithmeticException e) {
		
			
		}
	}
	
	public void div() throws ArithmeticException{
		int i = 9/0;	//exception Line
	}
	
	/*
	 * Error and exception
	 * 
	 * Error: syntax error fatal error memory leakage error memory full error
	 * Exception Unpredictable code...// code problem
	 */
}
