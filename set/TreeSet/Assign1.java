package collection.set.TreeSet;

import java.util.TreeSet;

public class Assign1 {
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

		// contains element or not 
		System.out.println(t.contains(196));
	}
}
