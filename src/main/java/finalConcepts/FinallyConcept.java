package finalConcepts;

public class FinallyConcept {

	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	}
	
	public static void test1() {
		try {
		System.out.println("Inside test1 method");
		throw new RuntimeException("Test");
		}catch (Exception e) {
			System.out.println("In sode catch block");
		}
		
		finally {
			System.out.println("Inside finally block");
		}
		/*
		 * finally is block
		 */
		
		/*
		 * In here First in try block - print 
		 * in next line throw some exception so it come to catch block
		 * print inside catch block
		 * 
		 * then what ever written in finally will be executed - like final
		 * finally is reserved blocked used to associated with the try - catch block
		 * it gives you guarantees that what ever the sections/code written
		 * inside finally block it will be executed
		 * 
		 * finally block will be executed after the try-catch block
		 * 
		 * whatever exception is coming doesn't matter
		 */
	}
	
	public static void test2() {
		
		try {
			System.out.println("Inside try - test2");
		}
		
		finally {
			System.out.println("In side finally - test2");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("In Try");
			int k = i/0;
		}//catch (ArithmeticException e){
			catch(NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("Divided By Zero Error");
		}
		
		finally {
			System.out.println("Execute this code even after any exception");
		}
		/*
		 * Here we have changed exception to null 
		 * catch the exception inside the null pointer exception
		 * exception handling is not proper 
		 * 
		 * interview - expecting arithmetic but catch in null pointer -- ??
		 * -->It will not come inside to catch block
		 * simple - try block - (unable to catch) - finally 
		 * 
		 * USE: Finally ??
		 * In database connectivity in finally need to write close the DB
		 */
	}
	
	
	
	/*Finalise : is some thing related to the garbage collector
	 * use to perform the clean up memory processing
	 * like inside the memory there are lot of garbage is there lot of objects are there
	 * it doesn't have any references
	 * just before we're calling garbage collector if you're declare that particular method
	 * as a finalise - it will start cleaning of the process 
	 * 
	 */
}
