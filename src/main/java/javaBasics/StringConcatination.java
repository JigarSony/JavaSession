package javaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		
		//+: is concatination operator
		
		//println:is use to print on console with anew line
		
		//print:is just use to on the console
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		double c= 12.33;
		double d=10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		System.out.println("Hello World");
		
		System.out.println(a);
		
		System.out.println("The value oa a:"+a);
		
		System.out.println("The Addition of A and B is"+(a+b));

	}

}
