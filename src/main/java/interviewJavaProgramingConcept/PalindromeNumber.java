package interviewJavaProgramingConcept;

public class PalindromeNumber {

	public static void main(String[] args) {
		isPalindromeNumber(121);
	}

	public static void isPalindromeNumber(int num) {

		int r=0;
		int sum=0;
		int t;

		t=num;

		while (num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if (t==sum) {
			System.out.println("This is Palindrome Number");
		}else {
			System.out.println("This is not Palindrome Number");
		}
	}
}