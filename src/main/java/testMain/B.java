package testMain;

public class B {

	public static void main(String[] args) {
		System.out.println("B -- main method");
		//A.main(args);
		//here controller is shifting to A to B, B to A..infinite time exe
		//stack overflow // memory full now
	}

}
