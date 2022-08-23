package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListIntegerSorting {

	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<Integer>();
		 
		//adding element in array
		num.add(19);
		num.add(16);
		num.add(181);
		num.add(170);
		num.add(89);
		num.add(211);
		num.add(856);
		num.add(105);
		
		System.out.println(num);
		
		//sorting the arraylist in ascending
		Collections.sort(num);
		System.out.println("Sorting in arraylist ascending:-"+num);
		
		//sorting the arraylist in descending
		Collections.sort(num,Collections.reverseOrder());
		System.out.println("Sorting in arraylist descending:-"+num);
		
		Iterator itr=num.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}
