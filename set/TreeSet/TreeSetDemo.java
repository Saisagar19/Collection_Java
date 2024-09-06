 package collection.set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(10); // Duplicates elements are not allowed
		t.add(10); // Null insertion not allowed
		t.add(196);
		t.add(789); // elements are sorted on some sorting order
		t.add(125); // homogeneous elements are allowed
		t.add(456);
		t.add(895);
		t.add(13);
		t.add(146);
		System.out.println(t);

		TreeSet ts = new TreeSet();
		ts.add("Lily"); // Duplicates elements are not allowed
		ts.add("rose"); // Null insertion not allowed
		ts.add("lotus");
		ts.add("jasmine"); // elements are sorted on some sorting order
		ts.add("iris");
		ts.add("tulip");
		ts.add("sunflower");
		System.out.println(ts);

		System.out.println(t.contains(196));
		// it will display first method
		System.out.println(t.first());

		// it will display last method
		System.out.println(t.last());
		
		//in HeadSet it will print set from starting element to the 456 but it will not include the 456 element that provided 
		System.out.println(t.headSet(456));
		
		//in TailSet it will print set from element that we provided to the last element , including the provided element that provided
		
		System.out.println(t.tailSet(456));
		
		// it will print the subset from one number to another but the another number will not print  
		System.out.println(t.subSet(10, 456));
		

	}
}
