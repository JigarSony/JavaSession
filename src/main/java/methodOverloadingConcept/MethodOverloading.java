package methodOverloadingConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(1);
		obj.sum(1,2);
	}
	
	//Can we overload main method? -- Yes we can
	public void main(int p) {
		
	}
	
	//we can not create method inside method
	//we can not create same method(duplicate method) : same name and same arguments with same data type
	
	//Method Overloading : when the method name is same with different arguments or inputs parameters with different data types within the same class.
	 
	public void sum () {//o param
		System.out.println("Sum Method -- Zero param");
	}
	
	public void sum(int i) {//1 param
		System.out.println("Sum Method -- One param");
	}
	
	public void sum(double i) {//1 param
		System.out.println("Sum Method -- One param");
	}
	
	public void sum(int i,int j) {//2 param
		System.out.println("Sum Method -- two param");
		System.out.println(i+j);
	}
}
