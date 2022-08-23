package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		
		//declaration of HashMap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//adding the value
		hm.put(101, "ABC");
		hm.put(102, "LMN");
		hm.put(103, "PQR");
		hm.put(104, "ABC");
		hm.put(105,  null);
		hm.put(null, null);
		
		System.out.println(hm);
		
		//adding dublicate keys
		hm.put(101, "ABC");
		hm.put(null, null);
		
		System.out.println(hm);
		
		//modifying the existing value
		hm.put(102,"DEF");
		System.out.println(hm);
		
		//removing the element
		hm.remove(105);
		System.out.println(hm);
		
		//how to read the data //key//value//key&value
		for(Entry m:hm.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
		
		
		

		
		
	}
}
