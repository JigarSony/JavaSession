package oopConceptPart1;

public class LocalvsGlobalVariables {
	
	//Global/Class Variables
	//scope : though out the program
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		 int i= 10;//local variables of main method
		 //scope only in this method 
		 System.out.println(i);
		 LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
		 
	}
	
	public void sum() {
		int i = 15;//local variable for some method
		int j = 20;		
	}
}
