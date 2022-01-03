package JUNIT.LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class NumberPlaylist {
	public static void main(String [] args) {
		//creating sample collection
		List<Integer> myNumberlist = new ArrayList<Integer>();
		for(int i=0; i<5; i++) myNumberlist.add(i);
		
		/* uc1.1,uc1.2*/
		
		//Method 1: Traversing using Iterator
		Iterator<Integer> it = myNumberlist.iterator();
		while(it.hasNext()) {
				Integer i  = it.next();
				System.out.println("Math1: Iterator value ::"+i);
				}
		//Method 2: Traversing with Explicit consumer interface implementation
		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Math2: Consumer implement value ::"+t);
				}
		
		}
		MyConsumer action  = new MyConsumer();
		myNumberlist.forEach(action);
		

		//Method 3: Traversing withAnonymous consumer interface implementation
		myNumberlist.forEach(new Consumer<Integer>() {
		public void accept (Integer t) {
			System.out.println("Math 3: ForEach anonymous class value :: "+t);
			
		}
	});
		/* uc1.3*/

	//Method 4: Explicit Lambda Function
		Consumer<Integer> myListAction = n -> {
			System.out.println("Math 4: forEach Lambda impl value ::"+ n);
		};
		myNumberlist.forEach(myListAction);
		
		//Method 5: Implicit Lambda Function
		myNumberlist.forEach(n -> {
			System.out.println("Math 5: forEach Lambda impl value ::" + n);
			
		});
		/* uc1.4*/

	//Method 6: Implicit Lambda Function to print double value
//	Function<Integer , Double> todoubleFunction = n ->n.doubleValue();
		Function<Integer , Double> todoubleFunction = Integer::doubleValue ;

	myNumberlist.forEach(n -> {
		System.out.println("Math 6: forEach Lambda double value:: " + todoubleFunction.apply(n));
		
	});
	/* uc1.5*/

	//Method 7 : implicit Lambda Function to check even
	Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0;
	myNumberlist.forEach(n-> {
		System.out.println("Math 7 : forEach value of : "+n+ "check for even: " + isEvenFunction.test(n));
	});
	}
}
	
