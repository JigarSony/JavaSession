package oopConceptPart1;

public class StaticAndNonStaticConcept {

	//global variables : scope - across all the function with some condition
	//static - directly or class name
	//non static -- by reference variable
	String name = "Tom"; //non static global variable
	static int age = 25; //static global variable
	public static void main(String[] args) {
		
		//how to call static method or variable
		//1. direct calling method:
		sum();
		//2. calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sentMail();
		System.out.println(obj.name);
		
		//can I access static method by using object reference? -- yes
		//but will give you one warning --access should be in static way 
		//not a good practice
		obj.sum();

	}
	
	public void sentMail() { //non static method
		System.out.println("Sent Mail Method");
	}
	
	public static void sum() {//static method
		System.out.println("Sum Method");
	}
}
