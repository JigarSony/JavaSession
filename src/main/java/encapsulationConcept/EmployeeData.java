package encapsulationConcept;

public class EmployeeData {
	
	//how to implements encapsulation
	//encapsulation is also called data hiding
	
	//1. private data variables: so that this variables can not accessed directly from 
	//outside the class
	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setEmpName("Tom Peter");
		emp.setEmpAge(25);
		emp.setSsn(123456);
		
		
		System.out.println("Employee name is: "+emp.getEmpName());
		System.out.println("Employee age is: "+emp.getEmpAge());
		System.out.println("Employee ssn is: "+emp.getSsn());
	}

	//2. getter and setter methods: to set and get the value of the fields.
	//getter and setter are public always
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
		//this.class variable = local variable 
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	/*
	 * Advantages of Encapsulation: improve maintenance of code, Flexibility and Reusability
	 * 
	 */

}
