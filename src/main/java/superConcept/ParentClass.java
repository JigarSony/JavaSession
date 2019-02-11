package superConcept;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("In Parent Class Constructor");
	}
	
	public ParentClass(int i) {
		System.out.println("In Parent Class Constructor & value of i:" +i);
	}
	
	public ParentClass(int i, int j) {
		System.out.println("In Parent Class Constructor & value of i:" +i);
		System.out.println("In Parent Class Constructor & value of j:" +j);
	}

}