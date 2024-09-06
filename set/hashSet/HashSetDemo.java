package collection.set.hashSet;

import java.util.HashSet;

public class HashSetDemo {
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

		// Assign1: Add another hashSet
		hs.addAll(h);
		System.out.println(hs);

		// Assign2: remove element from hashset
		hs.remove(55.2);
		System.out.println(hs);
		// remove all element from hashset
		hs.removeAll(h);
		System.out.println(hs);
		
		// particular element present or not
		System.out.println(hs.contains('A'));
		
		
		
		
	}
}
