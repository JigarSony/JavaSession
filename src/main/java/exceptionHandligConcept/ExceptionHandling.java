package exceptionHandligConcept;

public class ExceptionHandling {
	/*
	 * What is Exception : Any unwanted behaviour/exception of program so that will terminate your program/code
	 * Jvm will terminated and program will over
	 *	Null pointer exception
	 *	Array index exception
	 *	Time out exception
	 *	String out of bound exception
	 *	File not found exception
	 *	IO exception
	 *	uncaught exception : you never know what kind of exception coming here
	 */

	int a = 10;
	static ExceptionHandling obj3;

	public static void main(String[] args) {

		//uncaught exception:
		//		int i = 9/0;
		//		System.out.println(i);


		//caught exception:
		//Thread.sleep(5000);

		//null reference
		ExceptionHandling obj = null;

		//System.out.println(obj);

		ExceptionHandling obj1 = new ExceptionHandling();
		obj1 = null;
		//System.out.println(obj1);

		ExceptionHandling obj2 = new ExceptionHandling();
		obj2 = null;
		//if you comment upper line then it gives 10
		//System.out.println(obj2.a);

		//System.out.println(obj3);

		/*
		 * So how to handle this types of situation??
		 * We do Exception Handling
		 * 3 types of Exception Handling
		 * 
		 * 1. try-catch block
		 * 2. Throws Keyword
		 * 3. Throw Keyword

		 */

		//try - catch block
		/*
		 * Why we use try - catch block ? 
		 * Exception handling
		 * Reporting point of view
		 */

		try{
			int j = 9/0;	//this code will throw an exception
		}
		
		//catch(ArithmeticException e) {
		//catch(Error e) {
		//catch(Throwable e) {
		catch(Exception e) { //instead of writing specific exception name 	it will handle automatically
			/*
			 * The Throwable class is the superclass of all errors and exceptions in the Java language. 
			 * Only objects that are instances of this class (or one of its subclasses) are thrown 
			 * by the Java Virtual Machine or can be thrown by the Java throw statement. 
			 * Similarly, only this class or one of its subclasses can be the argument type in a 
			 * catch clause. For the purposes of compile-time checking of exceptions, 
			 * Throwable and any subclass of Throwable that is not also a subclass of either 
			 * RuntimeException or Error are regarded as checked exceptions.Instances of two 
			 * subclasses, java.lang.Error and java.lang.Exception, are conventionally used to 
			 * indicate that exceptional situations have occurred. Typically, 
			 * these instances are freshly created in the context of the exceptional situation 
			 * so as to include relevant information (such as stack trace data).
			 */

			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey This is / by zero exception");
		}

		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

	}

}
