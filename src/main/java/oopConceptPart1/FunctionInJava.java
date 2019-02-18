package oopConceptPart1;

public class FunctionInJava {

	//function and methods both are same things
	//main method -- starting point of execution
	public static void main(String[] args) {
		// new FunctionInJava(); -- object : object is created without name 
		
		FunctionInJava a = new FunctionInJava();
		//a is object name/object reference name  
		//new FunctionInJava(); -- object
		
		// object can hold only non static method 
		//object cannot hold any static method
		
		//object name cannot be duplicate
		//you can create n # of object with a different name
		
		//one copy of all the methods which are available in the particular class
		//is given to each and every object
		
		//one object will be created, a is reference variable of this object
		//after creating the object the copy of all non static method will be given to this object
		//Compulsory to create object for calling non static method in main
		//main method is void : b'cz we never write return statement/value inside it
		
			a.test();
			int l = a.pqr();
			System.out.println(l);
			String str = a.qa();
			System.out.println(str);
			int k = a.div(4, 2);
			System.out.println(k);
		
		}
	/*	1. Can not create a function inside a function
	 * 	2. function are independent to each other
	 * 	3. function are parallel to each other
	 * 	4. main method does not return any value,hence it is void
	 * 	5. main method automatiocally called by jvm
	 * 
	 * duplicate function/factory are not allowed
	 */
	
	//non static method
	//function : a factory
	//void : doesn't return any value
	
	public void test() { //no ip no op//0 para
		System.out.println("test method");
	}
	
	public void test(int i) { //no ip no op//1 para
		System.out.println("test method-para-1");
	}
	
	public void test(int i,int j) { //no ip no op//2 para
		System.out.println("test method-para-2");
	}
	
	public void test(String i,String j) { //no ip no op//2 para
		System.out.println("test method-para-2");
	}
	
	
	//method overloading : when in a same class, functions are having a same name
	//with different parameter/different types of para.
	
	
	//return type = int
	public int pqr() { //no ip some op
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c =a+b;
		
		return c;
	}
	//return type = String
	public String qa() {//no ip some op
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	//return type = int
	//x,y is input parameters/arguments
	public int div(int x, int y) {  
		System.out.println("div method");
		int z = x/y;
		return z;
	}
	
	public String SendMail(int p,String q) {
		System.out.println("send mail method");
		String h = q+p;
		return h;
	}
}
