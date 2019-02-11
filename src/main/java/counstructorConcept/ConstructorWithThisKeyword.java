package counstructorConcept;

public class ConstructorWithThisKeyword {
	
	//class variable
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name = name;
		this.age = age;
		/*
		 * if you don't want to use this key word 
		 * then you have to change the class variable name
		 * i.e. name1 = name;
		 * for 1 parameter need to create 2 parameter
		 */
		System.out.println(name);
		System.out.println(age);
	}
	
	/*
	 * this keyword is use to initialise class variables in the constructor
	 * this.global var = local var
	 */
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
		//this is a local variables given to the parameter constructor
		//but how to initialise class variables?-->this keyword
		
//		System.out.println(name);
//		System.out.println(age);
		
	}

}
