package A1javaBasics;

public class A2StringConcatination {

	public static void main(String[] args) {
		
		//+: is concatination operator
		
		//println:is use to print on console with anew line
		
		//print:is just use to on the console

		//if statement have not println then cursor should be in same line only
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double c= 12.33;
		double d=10.33;
		
		System.out.println(a+b); //300
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		
		System.out.println(c+d);//22.66
		System.out.println(x+y+c+d);//HelloWorld12.3310.33
		
		System.out.println("Hello World");//Hello World
		
		System.out.println(a);//100
		
		System.out.println("The value oa a:"+a);//The value oa a:100
		
		System.out.println("The Addition of A and B is"+(a+b));//The Addition of A and B is300
	}
	/**
	 * output:
	 * 300
	 * HelloWorld
	 * 300HelloWorld
	 * HelloWorld100200
	 * HelloWorld300
	 * 300HelloWorld100Hello200World
	 * 300HelloWorld100200
	 * 22.66
	 * HelloWorld12.3310.33
	 * Hello World
	 * 100
	 * The value oa a:100
	 * The Addition of A and B is300
	 */
}
