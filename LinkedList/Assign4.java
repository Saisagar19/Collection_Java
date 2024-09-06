package collection.LinkedList;

import java.util.LinkedList;

public class Assign4 {

	public static void main(String[] args) {
		
		LinkedList lt=new LinkedList();
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
		
		// add element at beginning
		lt.add(0, 99);
		System.out.println(lt);
		System.out.println("---------");
		
		// Add element at the end
		lt.add(7, "Bye");
		System.out.println(lt);
		System.out.println("---------");
		
		// Add elemnet at a specified position
		lt.add(5, false);
		System.out.println(lt);
	}
}
