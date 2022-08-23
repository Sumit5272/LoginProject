package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ListStringSorting {

	public static void main(String[] args) {
		//array list declaration==>Generic declaration
		ArrayList<String> list=new ArrayList<String>();	
		
		//adding the element
		list.add("audi");
		list.add("Activa");
		list.add("Maruti800");
		list.add("BMW");
		list.add("Bullet");
		list.add("nano");
		list.add("Mercedez-Benz");
		
		System.out.println("Arraylist before sorting:-"+list);
		
		//Sorting the arraylist in ascending order
		Collections.sort(list);
		System.out.println("Arraylist after sorting ascending:-"+list);
		
		//sorting the arraylist in descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Arraylist after sorting descending:-"+list);
		
		
		
		
	}
}
