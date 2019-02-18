package testMain;

public class TestBase {
	
	/*
	 * Can we Overload Main Method?
	 *	Yes we can overload main method
	 */
	
	//JVM search for (String args[]) -- public static void
	public static void main(String[] args) {
		System.out.println("In Main Method - 1");
		
		main("Selenium");
		main(1);
		main(1,2);
	}
	
	public static void main(String args) {
		System.out.println("In Main Method - 2");
	}
	
	public static void main(int a) {
		System.out.println("In Main Method - 3");
	}
	
	public static void main(int a,int b) {
		System.out.println("In Main Method - 4");
	}

}
