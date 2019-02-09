package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store similar data types value in a array variable
		
		
		//lowest bound/index = 0
		//upper bound n-1(n size of array)
		//1-d array
		//advantages : store multiple values in single variables  with similar data type
		//disadvantages : size is fix -- to over come we use collection---array list,hash table -- dynamic array
		// stores only similar data types values -- to overcome this problem we use object array
		
		//1. int array:

		
		int i[] = new int [4];
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;
		 
		 System.out.println(i[2]);		 
		 System.out.println(i[3]);
		 
		 //when you give if no location and you're accessing
		 //if you try to print size doesn't exist --
		 //System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException:
		 
		 System.out.println(i.length); //length/size of array

		 //print all values of array:use for loop
		 
		 for(int j = 0;j<i.length;j++) {
			 System.out.println(i[j]);
		 }
		 
		 //2. Double array
		 double d[] = new double[3]; 
		 d[0] = 12.33;
		 d[1] =30.10;
		 d[2] = 25.25;
		 
		 System.out.println(d[1]);
		 
		 
		 //3. character array
		 char c[] = new char[2];
		 c[0] = 'a';
		 c[1] = 'b';  
		 
		 System.out.println(c[0]);
		 
		 //4. boolean array
		 boolean b[] = new boolean[2];
		 
		 b[0] = true;
		 b[1] = false;
		 
		 System.out.println(b[0]);
		 
		 //5.String array
		 String s[] = new String[3];
		 
		 s[0] = "ABC";		 
		 s[1] = "ABCD";
		 s[2] = "ABCDEF";
		 
		 System.out.println(s.length);
		 System.out.println(s[1]);
		 
		 //6. Object array
		 //Object is class
		 //Object array is use to store different data types values
		 Object o[] = new Object[6];
		 o[0] = "TOM";
		 o[1] = 25;
		 o[2] = 'a';
		 o[3] = "11";
		 o[4] = "1/1/1990";
		 o[5] = true;
		 
		 System.out.println(o[3]);
		 System.out.println(o.length);
	}

}
