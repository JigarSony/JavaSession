package A2oopConceptPart1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.sum(x,y);//call/pass value
		//send the photocopy but in method it's changed so no effect one original one
		//copy of arguments or parameter
		System.out.println(obj.sum(x,y));
		int k = obj.sum(x,y);
		System.out.println(k);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sum(int a,int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	//call by reference
	public void swap(CallByValueAndCallByReference t) {
		int temp;
		temp = t.p; //temp=50
		t.p=t.q; //t.p = 60
		t.q = temp;//t.q=50
	}

	/**
	 * output:
	 * 70
	 * 70
	 * 60
	 * 50
	 */
}
