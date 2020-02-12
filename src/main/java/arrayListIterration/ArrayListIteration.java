package arrayListIterration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		//define arraylist to string datatype
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		//adding list into tvSeries
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The big bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		
		System.out.println("--------Print using Lambda function-----------");
		
		//1. iterate with help of java 8 with for each loop and lambda expression
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("----------Print using iterator--------------");
		
		//2. using iterator
		Iterator<String> itts = tvSeries.iterator();
		
		while(itts.hasNext()) {
			String shows= itts.next();
			System.out.println(shows);
		}
		
		System.out.println("----------iterator and java 8 forEachRemaining() method--------------");
		
		//3. using iterator and java 8 forEachRemaining() method
		
		itts = tvSeries.iterator();
		itts.forEachRemaining(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("----------Print using forEachloop--------------");
		
		//4. using forEachloop
		for(String shows:tvSeries) {
			System.out.println(shows);
		}
		
		System.out.println("----------Print using forloop--------------");
		
		//5. using forloop
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		System.out.println("------Print using List Iterator");
		
		//6. using List Iterator() to traverse both the direction
		
		ListIterator<String>tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
		
		while(tvSeriesListIterator.hasNext()) {
			String show = tvSeriesListIterator.next();
			System.out.println(show);
		}
		
	}

}
