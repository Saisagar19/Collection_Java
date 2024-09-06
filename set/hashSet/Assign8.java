package collection.set.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assign8 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10); // insertion is based on hash code
		hs.add(10); // Duplicate elements are not allowed
		hs.add("Sagar");
		hs.add(55.2); // Heterogeneous elements are allowed
		hs.add('A');
		hs.add(null); // Only one null is allowed
		hs.add(100);
		hs.add("Lily");
		hs.add(null);
		System.out.println(hs);

		HashSet h = new HashSet();
		h.add(10);
		h.add("Rohan");
		h.add(5.3);
		h.add('Z');
		h.add(null);
		h.add(100.2);
		h.add("Lotus");

		//size of an set
		
		System.out.println(hs.size());
	}

}
