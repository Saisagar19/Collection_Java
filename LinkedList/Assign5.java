package collection.LinkedList;

import java.util.LinkedList;

public class Assign5 {
	public static void main(String[] args) {
		LinkedList lt = new LinkedList();
		lt.add("Sagar");
		lt.add(100);
		lt.add("Student");
		lt.add("Sit College");
		lt.add('A');
		lt.add(0.33);
		lt.add(true);
		lt.add(110);

		System.out.println(lt);
		System.out.println("---------");
		// retrieve head element
		System.out.println(lt.get(0));
		System.out.println("---------");

		// remove head element
		lt.remove();
		System.out.println(lt);
		System.out.println("---------");
		
		// retrieve and remove an element
		System.out.println(lt.poll());
		System.out.println(lt);
	}

}
