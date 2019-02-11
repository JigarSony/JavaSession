package superConcept;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super();
		System.out.println("In Child Class Constructor");
	}

	public ChildClass(int i) {
		super(i);
		System.out.println("In Child Class Constructor");
	}

	public ChildClass(int i, int j) {
		super(i, j);
		System.out.println("In Child Class Constructor");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		ChildClass obj1 = new ChildClass(10);
		ChildClass obj2 = new ChildClass(10, 20);
	}

	/*
	 * Here we have two class parent and child child is extending parent First
	 * parent have no constructor but child have - run called child only 2:parent
	 * have also explicit and child have also - run - first parent - child 3:parent
	 * have 1(one) integer argument cons also : use super(10) in child class - 10
	 * and child not execute default parent constructor now why? - you're explicitly
	 * trying to execute parameter constructor
	 * 
	 * super keyword : is use to call parent class constructor if you don't write
	 * super keyword by default default constructor will be called
	 * 
	 * if you use super keyword with arguments parameterise constructor will be
	 * called
	 * 
	 * : written in always child class : is first statement in any particular
	 * constructor
	 *
	 * :inside one constructor we can not create/use two super keyword that's why we
	 * need to create three different constructor with different constructor
	 */

}
