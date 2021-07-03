package A1javaBasics;

public class A3IfElseConcept {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		//inside if boolean condition :true/false
		if(b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greater than b");
		}
		
		//comparision variables
		// < > <= >= == !=
		
		int c = 50;
		int d = 40;
		
		//== comparison
		//= assigning to value to left hand side variables
		//=:assignment operator
		
		if(c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find out highest number
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		if(a1>b1 & a1>c1) {//f&f=f||t&t=t||t&f=f 
			System.out.println("a1 is greatest");
		}else if (b1>c1){
			System.out.println("b1 is greatest");
		}
		else {
			System.out.println("c1 is greatest");
		}
		/**
		 * output:
		 * a is greater than b
		 * c and d are not equal
		 * c1 is greatest
		 */
	}

}
