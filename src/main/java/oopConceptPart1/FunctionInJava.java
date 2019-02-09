package oopConceptPart1;

public class FunctionInJava {

	//function and methods both are same things
	//main method -- starting point of execution
	public static void main(String[] args) {
		FunctionInJava a = new FunctionInJava();
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
	//non static method
	//function : a factory
	//void : doesn't return any value
	public void test() { //no ip no op
		System.out.println("test method");
	}
	
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
}
