package counstructorConcept;

public class ConstructorConcept {
	
	/*
	 * Constructor: is class entity which is used to define some class feature
	 * while creating objects
	 * if you want to define some class future in a form of global variables
	 * in the form of objects
	 * 
	 * 
	 * : having properties
	 * it's look like a function but it's not a function
	 * : cann't written any value
	 * : name should be same as class name always
	 * : no static no return type
	 */
	
	//default constructor: with zero parameter(not passing anything)
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
		System.out.println("The value if i "+i);
	}
	
	public ConstructorConcept(int i,int j) {
		System.out.println("two param constructor");
		System.out.println("The value if i "+i);
		System.out.println("The value if j "+j);
	}
	/*
	 * it's constructor overloading
	 * :also overloaded
	 * :duplicate not allowed
	 * :how to call :will be called immediately when you create the object of that 
	 * Particular class
	 * 
	 * :how to call method?:if non static - via object - via object reference we
	 * have to call it
	 * 
	 * :In constructor when you create object of the class automatically constructor
	 * is called 
	 */
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		/*
		 * calling default Constructor
		 */
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		
		/*
		 * One hidden constructor is there
		 * but blank o/p : no o/p
		 */
	}

}
